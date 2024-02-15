package com.lagnada.modernj.fundamentals;

class Animal {
  public void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Pig extends Animal {
  public void sound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void sound() {
    System.out.println("The dog says: bow wow");
  }
}
