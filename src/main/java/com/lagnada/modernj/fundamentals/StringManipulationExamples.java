package com.lagnada.modernj.fundamentals;

public class StringManipulationExamples {
  public static void main(String[] args) {
    // Concatenation
    String greeting = "Hello, " + "World!";
    // Output: Hello, World!
    System.out.println(greeting);

    // Substring
    String sub = greeting.substring(7, 12);
    System.out.println(sub); // Output: World

    // Character at a specific position
    char letter = greeting.charAt(1);
    System.out.println(letter); // Output: e

    // Replace
    String replacedString = greeting.replace("World", "Java");
    System.out.println(replacedString); // Output: Hello, Java!

    // Convert to Upper Case
    String upperCaseString = greeting.toUpperCase();
    System.out.println(upperCaseString); // Output: HELLO, WORLD!

    // Checking equality
    System.out.println("Java".equals("java")); // Output: false
    System.out.println("Java".equalsIgnoreCase("java")); // Output: true
  }
}

