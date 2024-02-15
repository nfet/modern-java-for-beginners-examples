package com.lagnada.modernj.oo;

class Car {
  String brand;
  String model;

  // Constructor
  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  // Method
  public void startEngine() {
    System.out.println("Starting the engine of " + brand + " " + model);
  }
}

class CreateCarObjects {
  public static void main(String[] args) {
    // Creating objects from the class
    Car car1 = new Car("Toyota", "Camry");
    Car car2 = new Car("Honda", "Civic");
  }
}
