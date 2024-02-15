package com.lagnada.modernj.collections;

import java.util.LinkedList;

public class LinkedListExample {
  public static void main(String[] args) {
    // Creating a LinkedList of strings
    LinkedList<String> names = new LinkedList<>();

    // Adding elements to the LinkedList
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // Accessing elements
    String firstPerson = names.get(0); // Output: "Alice"

    // Removing elements
    names.remove(1); // Removes the element at index 1

    // Iterating over the elements using a for-each loop
    for (String name : names) {
      System.out.println(name);
    }
  }
}
