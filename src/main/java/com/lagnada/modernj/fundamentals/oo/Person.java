package com.lagnada.modernj.fundamentals.oo;

public class Person {
  private String name; // Private attribute

  // Constructor
  public Person(String name) {
    this.name = name;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }
}
