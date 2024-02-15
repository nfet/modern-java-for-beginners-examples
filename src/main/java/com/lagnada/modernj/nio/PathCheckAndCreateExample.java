package com.lagnada.modernj.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class PathCheckAndCreateExample {
  public static void main(String[] args) {
    Path newDirPath = Paths.get("example", "newDir");

    try {
      if (Files.notExists(newDirPath)) {
        Files.createDirectories(newDirPath);
        System.out.println("Directory created: " + newDirPath);
      } else {
        System.out.println("Directory already exists: " + newDirPath);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
