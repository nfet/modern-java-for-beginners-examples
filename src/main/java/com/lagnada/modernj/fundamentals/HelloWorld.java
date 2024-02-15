package com.lagnada.modernj.fundamentals;

import java.util.List;
import static java.lang.System.out;

public class HelloWorld {
  public static void main(String[] args) {
    // Create an ArrayList to store strings
    List<String> greetings = List.of("Hello, World!", "Hello, Java!");

    // Iterate through the list and print each greeting
    for (String greeting : greetings) {
      out.println(greeting);
    }
  }

}

