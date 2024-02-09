package com.lagnada.modernj.fundamentals.oo;

public interface Vehicle {
  default void start() {
    System.out.println("Vehicle is starting");
  }
}
