package com.lagnada.modernj.fundamentals;

public class HelloWorldBasicSyntax {
  public static void main(String[] args) {
    // Variable declaration
    int number = 5;

    // Conditional statement
    if (number > 0) {
      System.out.println("The number is positive.");
    } else {
      System.out.println("The number is not positive.");
    }

    // Loop statement
    for(int i = 0; i < number; i++) {
      System.out.println("This is message number " + (i + 1));
    }
  }
}
