package com.lagnada.modernj.fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BasicIOExamples {
  public static void main(String[] args) throws IOException {
    // Reading from the console using BufferedReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter your name: ");
    String name = reader.readLine();
    System.out.println("Hello, " + name + "!");

    // Writing to the console using System.out.println
    System.out.println("This is an example of writing to the console.");
  }
}

