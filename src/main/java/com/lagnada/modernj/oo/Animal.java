package com.lagnada.modernj.oo;

// Superclass
class Animal {
  void makeSound() {
    System.out.println("Some generic animal sound");
  }
}

// Subclass inheriting from Animal
class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Woof! Woof!");
  }
}
