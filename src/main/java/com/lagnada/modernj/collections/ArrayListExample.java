package com.lagnada.modernj.collections;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
// Creating an ArrayList of integers
ArrayList<Integer> numbers = new ArrayList<>();

// Adding elements to the ArrayList
numbers.add(10);
numbers.add(20);
numbers.add(30);

// Accessing elements
int firstNumber = numbers.get(0); // Output: 10

// Removing elements
numbers.remove(1); // Removes the element at index 1

// Iterating over the elements using a for-each loop
for (int number : numbers) {
  System.out.println(number);
}
  }
}
