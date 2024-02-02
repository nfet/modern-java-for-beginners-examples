package com.lagnada.modernj.fnprog;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleWithList {

  public static void main(String[] args) {
    List<String> names = List.of("Steve", "Linda", "Clark", "Bruce");

    sayHelloAnonymousClass(names);
    sayHelloFunctional(names);
  }

  private static void sayHelloAnonymousClass(List<String> names) {
    // Define a Consumer to print names
    Consumer<String> stringConsumer = new Consumer<String>() {
      @Override
      public void accept(String name) {
        System.out.println("Hello, " + name);
      }
    };
    names.forEach(stringConsumer);
  }

  private static void sayHelloFunctional(List<String> names) {
    names.forEach(name -> System.out.println("Hello, " + name));
  }
}
