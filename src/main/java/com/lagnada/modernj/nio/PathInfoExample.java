package com.lagnada.modernj.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfoExample {
  public static void main(String[] args) {
    Path filePath = Paths.get("example", "demo.txt");

    Path fileName = filePath.getFileName();
    System.out.println("File name: " + fileName);

    Path parentDir = filePath.getParent();
    System.out.println("Parent directory: " + parentDir);

    Path rootDir = filePath.getRoot();
    System.out.println("Root directory: " + rootDir);
  }
}
