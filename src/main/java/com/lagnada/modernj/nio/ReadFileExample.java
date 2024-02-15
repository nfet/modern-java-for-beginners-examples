package com.lagnada.modernj.nio;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ReadFileExample {
  public static void main(String[] args) {
    try {
      List<String> lines = Files.readAllLines(Paths.get("file.txt"));
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
