package com.lagnada.modernj.fnprog;

import java.util.stream.Stream;
import java.util.function.Supplier;

public class SupplierExample {
  public static void main(String[] args) {
    Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
    Stream.generate(randomSupplier)
            .limit(5)
            .forEach(System.out::println);
  }
}
