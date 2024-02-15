package com.lagnada.modernj.collections;

import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    // Creating a TreeMap of fruits and their quantities
    TreeMap<String, Integer> fruitQuantities = new TreeMap<>();

    // Adding key-value pairs to the TreeMap
    fruitQuantities.put("Apple", 10);
    fruitQuantities.put("Banana", 20);
    fruitQuantities.put("Orange", 15);

    // Removing a key-value pair
    fruitQuantities.remove("Banana");

    // Getting the first and last keys (sorted order)
    // Output: "Apple"
    String firstFruit = fruitQuantities.firstKey();

    // Output: "Orange"
    String lastFruit = fruitQuantities.lastKey();

    // Iterating over the key-value pairs
    // using a for-each loop (sorted order)
    for (String fruit : fruitQuantities.keySet()) {
      int quantity = fruitQuantities.get(fruit);
      System.out.println(fruit + ": " + quantity);
    }
  }
}
