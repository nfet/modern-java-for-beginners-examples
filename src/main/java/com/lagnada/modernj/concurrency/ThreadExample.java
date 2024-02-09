package com.lagnada.modernj.concurrency;

public class ThreadExample {
  public static void main(String[] args) {
    // Create a new thread using the Runnable interface
    Runnable task = () -> {
      // Task to execute in a new thread
      System.out.println("Hello from a thread! Executed by: " + Thread.currentThread().getName());
    };

    // Instantiate the Thread with the task to execute
    Thread thread = new Thread(task);

    // Start the thread
    thread.start();

    // Print a message from the main thread
    System.out.println("Hello from the main thread! Executed by: " + Thread.currentThread().getName());
  }
}

