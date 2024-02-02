package com.lagnada.modernj.fnprog;

import java.util.Arrays;
import java.util.List;

public class BasicStreamExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    int sum = numbers.stream()
        .mapToInt(n -> n % 2 == 0 ? n : 0)
        .sum();

    // Output: Sum of even numbers: 6
    System.out.println("Sum of even numbers: " + sum);
  }
}
