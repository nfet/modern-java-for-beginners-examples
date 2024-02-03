package com.lagnada.modernj.fundamentals;

public class StringFormattingExamples {

  public static void main(String[] args) {
    // Using printf
    System.out.printf("Name: %s, Age: %d, Height: %.2f meters%n", "John Doe", 30, 1.75);

    // Using String.format
    String formattedString = String.format("Date: %1$tm/%1$td/%1$tY", new java.util.Date());
    // Output: Date: MM/DD/YYYY (current date)
    System.out.println(formattedString);

    // Formatting a number with commas
    System.out.printf("Large Number: %,d%n", 1000000);

    // Left-justify within a specified width
    System.out.printf("Name: %-10s Age: %-5d%n", "Jane", 28);

    // Displaying a floating-point number up to 3 decimal places
    System.out.printf("Weight: %.3f kg%n", 70.12345);

    // Using String.fomrmatted(string, args...)
    System.out.println("Weight: %.3f kg%n".formatted(70.12345));
  }

}

