package com.lagnada.modernj.fundamentals.oo;

class MathOperations {
  // Method overloading for 'add' method
  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }
}

class UsingMathOperations {
  public static void main(String[] args) {
    MathOperations m = new MathOperations();
    // Output 3
    System.out.println("1 + 2 is: " + m.add(1, 2));
    // Output: 3.3
    System.out.printf("1.1 + 2.2 is: %.1f%n", m.add(1.1, 2.2));
  }
}
