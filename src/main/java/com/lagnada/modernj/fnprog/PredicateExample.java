package com.lagnada.modernj.fnprog;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
  public static void main(String[] args) {
    List<String> names = List.of("Alice", "Bob", "Charlie");
    Predicate<String> startsWithC = name -> name.startsWith("C");

    // Names that Start with “C”
    List<String> namesWithC = names.stream()
            .filter(startsWithC)
            .collect(Collectors.toList());
    // Output: [Charlie]
    System.out.println(namesWithC);
  }
}
