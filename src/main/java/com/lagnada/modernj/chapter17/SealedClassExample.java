package com.lagnada.modernj.chapter17;

public class SealedClassExample {
  public static void main(String[] args) throws InterruptedException {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape square = new Square();

Thread virtualThread = Thread.startVirtualThread(() -> {
  System.out.printf("[%s]: Hello%n", Thread.currentThread()
          .getThreadGroup().getName());
});
virtualThread.join();
System.out.printf("[%s]: Hello%n", Thread.currentThread()
        .getThreadGroup().getName());

// Output:
//[VirtualThreads]: Hello
//[main]: Hello

  }
}


sealed class Shape permits Circle, Rectangle, Square {
  // Class definition
}

final class Circle extends Shape {
  // Class definition
}

final class Rectangle extends Shape {
  // Class definition
}

final class Square extends Shape {
  // Class definition
}

// Not Allowed
/*
final class Octagon extends Shape {
  // Class definition
}
*/

