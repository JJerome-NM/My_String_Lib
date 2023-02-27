package com.string_lib;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StringController {
  public static Collection<Character> findUniqueChars(String line){
    return line.replaceAll("\\s+", "").toLowerCase().chars()
            .mapToObj(line::charAt)
            .collect(Collectors.toSet());
  }

  public static Collection<Character> findUniqueChars(List<String> strings){
    return strings.stream()
            .map(line -> line.replaceAll("\\s+", ""))
            .map(String::toLowerCase)
            .flatMapToInt(String::chars)
            .mapToObj(ch -> (char) ch)
            .collect(Collectors.toSet());
  }

  public static Collection<Character> findUniqueChars(String... strings){
    return findUniqueChars(Arrays.asList(strings));
  }
}
