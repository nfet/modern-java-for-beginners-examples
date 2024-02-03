package com.lagnada.modernj.fundamentals;

public class Calculator {

  // Method to add two numbers
  public static int add(int num1, int num2) {
    return num1 + num2;
  }

  // Method to subtract two numbers
  public static int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public static void main(String[] args) {
    // Calling the add method
    int sum = add(5, 3);
    // Calling the subtract method
    int difference = subtract(5, 3);

    // Output: Sum: 8
    System.out.println("Sum: " + sum);
    // Output: Difference: 2
    System.out.println("Difference: " + difference);
  }

}

