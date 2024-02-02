package com.lagnada.modernj.fnprog;

import java.util.stream.Stream;
import java.util.function.BiFunction;

public class BiFunctionExample {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

    Stream.of(1, 2, 3, 4, 5)
            .map(num -> add.apply(num, 10))
            .forEach(System.out::println);
  }
}
