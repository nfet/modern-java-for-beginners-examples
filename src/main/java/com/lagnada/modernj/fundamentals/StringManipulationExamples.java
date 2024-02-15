package com.lagnada.modernj.fundamentals;

public class StringManipulationExamples {
  public static void main(String[] args) {
    // Concatenation
    String greeting = "Hello, " + "World!";
    System.out.println(greeting);

    // Substring, Character at a specific position, Replace, Convert to Upper Case
    System.out.println(greeting.substring(7)); // World!
    System.out.println(greeting.charAt(1)); // e
    System.out.println(greeting.replace("World", "Java")); // Hello, Java!
    System.out.println(greeting.toUpperCase()); // HELLO, WORLD!

    // Checking equality
    System.out.println("Java".equals("java")); // false
    System.out.println("Java".equalsIgnoreCase("java")); // true
  }
}

