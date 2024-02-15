package com.lagnada.modernj.stdlib;

import java.io.IOException;
import java.nio.file.*;

public class NIO2Example {
  public static void main(String[] args) {
    // Creating a Path instance for a file
    Path path = Paths.get("example.txt");

    // Writing to a file
    try {
      Files.writeString(path, "Hello, NIO.2!");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Reading from a file
    try {
      String content = Files.readString(path);
      System.out.println(content); // Outputs: Hello, NIO.2!
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
