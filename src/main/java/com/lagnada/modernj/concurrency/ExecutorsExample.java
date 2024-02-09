package com.lagnada.modernj.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
  public static void main(String[] args) throws InterruptedException {
    // Creating an ExecutorService with a fixed thread pool size
    ExecutorService executor = Executors.newFixedThreadPool(2);

    // Submitting runnable tasks to the executor
    executor.submit(() -> {
      System.out.println("Task 1 executed by: " + Thread.currentThread().getName());
    });

    executor.submit(() -> {
      System.out.println("Task 2 executed by: " + Thread.currentThread().getName());
    });

    // Initiating an orderly shutdown
    executor.shutdown();
    executor.awaitTermination(5, TimeUnit.SECONDS);

    System.out.println("All tasks completed.");
  }
}
