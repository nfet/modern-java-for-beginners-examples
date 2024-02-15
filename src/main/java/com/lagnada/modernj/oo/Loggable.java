package com.lagnada.modernj.oo;

public interface Loggable {
  static void log(String message) {
    System.out.println("Logging: " + message);
  }
}
