package com.lagnada.modernj.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
  public static void main(String[] args) {
    // Creating a Path object
    Path path = Paths.get("my_directory", "file.txt");
    System.out.println("Path: " + path.toString());
  }
}
