package com.lagnada.modernj.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
  public static void main(String[] args) throws InterruptedException {

    // Create an AtomicInteger instance with initial value 0
    final AtomicInteger counter = new AtomicInteger(0);

    // Runnable task that increments the counter 1000 times
    Runnable incrementTask = () -> {
      for (int i = 0; i < 1000; i++) {
        counter.incrementAndGet(); // Atomically increments by one
      }
    };

    // Create and start two threads executing the incrementTask
    Thread thread1 = new Thread(incrementTask);
    Thread thread2 = new Thread(incrementTask);

    thread1.start();
    thread2.start();

    // Wait for both threads to finish
    thread1.join();
    thread2.join();

    // Print the final value of the counter
    System.out.println("Final counter value: " + counter.get());

  }
}

