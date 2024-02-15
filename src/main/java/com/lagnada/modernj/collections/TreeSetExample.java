package com.lagnada.modernj.collections;

import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {
    // Creating a TreeSet of strings
    TreeSet<String> names = new TreeSet<>();

    // Adding elements to the TreeSet
    names.add("Linda");
    names.add("Steve");
    names.add("Clark");

    // Removing an element
    names.remove("Steve");

    // Getting the first and last elements (sorted order)
    String firstPerson = names.first(); // Output: "Linda"
    String lastPerson = names.last(); // Output: "Clark"

    // Iterating over the elements using a for-each loop (sorted order)
    for (String name : names) {
      System.out.println(name);
    }
  }
}
