package com.lagnada.modernj.fnprog;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExampleJDK8 {
  public static void main(String[] args) {
    List<String> names = List.of("Steve", "Linda", "Clark", "Bruce");

    Function<String, String> addPrefix = name -> "Hello, " + name;

    List<String> greetings = names.stream()
            .map(addPrefix)
            .collect(Collectors.toList()); //since JDK8

    greetings.forEach(System.out::println);
  }
}
