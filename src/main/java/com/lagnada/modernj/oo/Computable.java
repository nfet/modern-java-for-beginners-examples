package com.lagnada.modernj.oo;

public interface Computable {
  private static int privateCalculationMethod(int value) {
    // Complex calculation
    return value * value;
  }

  static int computeSquare(int value) {
    return privateCalculationMethod(value);
  }
}
