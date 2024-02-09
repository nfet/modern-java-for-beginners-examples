package com.lagnada.modernj.fundamentals.oo;

public interface Loggable {
  static void log(String message) {
    System.out.println("Logging: " + message);
  }
}
