package com.lagnada.modernj.oo.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Animal {
  void eat(); // interface method
  void travel(); // interface method

  default void makeSound() {
    System.out.println("Animal makes a sound");
    Set<String> sets = List.of("hello", "there").stream().collect(Collectors.toSet());
    List<Integer> numList = IntStream.of(1, 2, 3).boxed().toList();

  }
}

class Mammal implements Animal {
  public void eat() {
    System.out.println("Mammal eats");
  }

  public void travel() {
    System.out.println("Mammal travels");
  }

  // Example of calling the default method makeSound from the subclass
  public void makeMammalSound() {
    makeSound(); // Call the default method from the superclass
  }
}

