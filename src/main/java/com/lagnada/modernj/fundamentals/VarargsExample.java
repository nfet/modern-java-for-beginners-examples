package com.lagnada.modernj.fundamentals;

public class VarargsExample {

  // Method using varargs to calculate sum
  public static int calculateSum(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  public static void main(String[] args) {
    // Output: 3
    System.out.println(calculateSum(1, 2));
    // Output: 15
    System.out.println(calculateSum(1, 2, 3, 4, 5));
  }

}

