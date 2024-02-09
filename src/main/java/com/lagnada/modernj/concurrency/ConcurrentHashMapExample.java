package com.lagnada.modernj.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
  public static void main(String[] args) throws InterruptedException {
// Create a ConcurrentHashMap instance
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

// Populate the map
map.put("One", 1);
map.put("Two", 2);

// Create a thread to update the map
Thread updateThread = new Thread(() -> {
  map.put("Three", 3);
  System.out.println("Added 'Three' = 3");
});

// Create a thread to read from the map
Thread readThread = new Thread(() -> {
  Integer value = map.get("Two");
  System.out.println("'Two' = " + value);
});

// Start both threads
updateThread.start();
readThread.start();

// Wait for both threads to complete
updateThread.join();
readThread.join();

// Iterating over map entries
map.forEach((key, value) -> System.out.println(key + " = " + value));

System.out.println("Final map content: " + map);

  }
}

