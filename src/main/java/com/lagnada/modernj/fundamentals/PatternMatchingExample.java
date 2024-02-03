package com.lagnada.modernj.fundamentals;

public class PatternMatchingExample {

  public static void main(String[] args) {
    Object obj = "Hello, World!";

    String result = switch (obj) {
      case String s -> "String of length " + s.length();
      case Integer i -> "Integer with value " + i;
      default -> "Unknown type";
    };

    System.out.println(result);
  }

}

