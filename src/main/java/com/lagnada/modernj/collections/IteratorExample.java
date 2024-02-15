package com.lagnada.modernj.collections;

import java.util.Iterator;
import java.util.List;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class IteratorExample {
  public static void main(String[] args) {
    // Creating an ArrayList of integers
    List<Integer> numbers = List.of(10, 20, 30);

    // Getting the iterator for the ArrayList
    Iterator<Integer> iterator = numbers.iterator();

    // Iterating over the elements using the iterator
    while (iterator.hasNext()) {
      int number = iterator.next();
      System.out.println(number);
    }
  }
}
