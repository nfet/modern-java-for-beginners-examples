package com.lagnada.modernj.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
  public static void main(String[] args) {
    // Creating a CompletableFuture that completes with a value
    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
      return "Result from CompletableFuture";
    });

    // Attaching a callback to be executed upon completion
    future.thenAccept(result -> System.out.println(result));

    // Wait for all asynchronous operations to complete
    CompletableFuture.allOf(future).join();
    System.out.println("Completed CompletableFuture example.");
  }
}
