package com.lagnada.modernj.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
  public static void main(String[] args) throws InterruptedException {
// Create a CountDownLatch with a count of 2
CountDownLatch latch = new CountDownLatch(2);

// Create and start two threads
new Thread(() -> {
  try {
    System.out.println("Task 1 is running.");
    Thread.sleep(1000); // Simulate work
    System.out.println("Task 1 completed.");
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
  } finally {
    latch.countDown(); // Decrement the count
  }
}).start();

new Thread(() -> {
  try {
    System.out.println("Task 2 is running.");
    Thread.sleep(1000); // Simulate work
    System.out.println("Task 2 completed.");
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
  } finally {
    latch.countDown(); // Decrement the count
  }
}).start();

// Wait for both tasks to complete
latch.await();
System.out.println("Both tasks have completed. Main thread is proceeding.");

  }
}

