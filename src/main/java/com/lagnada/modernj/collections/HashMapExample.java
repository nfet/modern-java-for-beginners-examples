package com.lagnada.modernj.collections;

import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    // Creating a HashMap of countries and their capitals
    HashMap<String, String> capitals = new HashMap<>();

    // Adding key-value pairs to the HashMap
    capitals.put("USA", "Washington, D.C.");
    capitals.put("India", "New Delhi");
    capitals.put("Japan", "Tokyo");

    // Accessing a value using a key
    String capitalOfIndia = capitals.get("India"); // Output: "New Delhi"

    // Removing a key-value pair
    capitals.remove("Japan");

    // Checking if a key is present
    boolean containsIndia = capitals.containsKey("India"); // Output: true

    // Iterating over the key-value pairs using a for-each loop
    for (String country : capitals.keySet()) {
      String capital = capitals.get(country);
      System.out.println(country + ": " + capital);
    }
  }
}
