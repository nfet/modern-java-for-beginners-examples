package com.lagnada.modernj.fundamentals;

class Vehicle {
  protected String brand = "Ford"; // Vehicle attribute
  public void honk() { // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang"; // Car attribute
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
