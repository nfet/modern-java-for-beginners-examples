package com.lagnada.modernj.fundamentals;

public class StringFormattingExamples {

  public static void main(String[] args) {
    // Using printf and String.format for dynamic text construction
    System.out.printf("Name: %s, Age: %d, Height: %.2f meters%n", "John Doe", 30, 1.75);
    String formattedString = String.format("Date: %1$tm/%1$td/%1$tY", new java.util.Date());
    System.out.println(formattedString);

    // Number formatting, text justification, and precision control
    System.out.printf("Large Number: %,d%n", 1000000);
    System.out.printf("Name: %-10s Age: %-5d%n", "Jane", 28);
    System.out.printf("Weight: %.3f kg%n", 70.12345);
  }

}

