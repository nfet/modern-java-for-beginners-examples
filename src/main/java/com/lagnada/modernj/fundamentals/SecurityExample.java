package com.lagnada.modernj.fundamentals;

import java.io.IOException;

public class SecurityExample {
  public static void main(String[] args) {
    // Set the security manager
    System.setSecurityManager(new SecurityManager());

    try {
      // Attempt to read a system property
      System.out.println("OS Name: " + System.getProperty("os.name"));

      // Attempt to write to a file
      java.nio.file.Path path = java.nio.file.Paths.get("test.txt");
      java.nio.file.Files.writeString(path, "Hello, World!");
    } catch (SecurityException se) {
      System.err.println("Caught SecurityException: " + se.getMessage());
    } catch (IOException ie) {
      System.err.println("Caught IOException: " + ie.getMessage());
    }
  }
}

