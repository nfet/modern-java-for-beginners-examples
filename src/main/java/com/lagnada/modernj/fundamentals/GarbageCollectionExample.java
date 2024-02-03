package com.lagnada.modernj.fundamentals;

public class GarbageCollectionExample {

  public static void main(String[] args) {
    // Creating objects
    String str1 = new String("Java Fundamentals");
    String str2 = new String("Garbage Collection");

    // Nullifying references
    str1 = null;
    str2 = null;

    // Suggesting JVM to run Garbage Collector
    System.gc();

    System.out.println("Garbage Collection requested");
  }

}

