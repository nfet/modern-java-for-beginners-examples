package com.lagnada.modernj.fnprog;

import java.util.List;

public class FunctionExample {
  public static void main(String[] args) {
    List<String> names = List.of("Steve", "Linda", "Clark", "Bruce");

    List<String> greetings = names.stream()
            .map(name -> "Hello, " + name)
            .toList(); // since JDK 16

    greetings.forEach(System.out::println);
  }
}
