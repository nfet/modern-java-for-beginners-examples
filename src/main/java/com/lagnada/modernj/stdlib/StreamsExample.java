package com.lagnada.modernj.stdlib;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Java", "Python", "C++", "JavaScript");

    // Using the Streams API to filter, sort, and collect names
    List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("J"))
            .sorted()
            .collect(Collectors.toList());

    System.out.println(filteredNames); // Output: [Java, JavaScript]
  }
}
