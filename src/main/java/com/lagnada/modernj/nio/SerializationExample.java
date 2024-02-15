package com.lagnada.modernj.nio;

import java.io.*;

public class SerializationExample {
  public static void main(String[] args) {
    // Object to be serialized
    Person person = new Person("John", 30);

    // Serialization
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
      oos.writeObject(person);
      System.out.println("Serialization successful.");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialization
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
      Person deserializedPerson = (Person) ois.readObject();
      System.out.println("Deserialization successful: " + deserializedPerson);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

class Person implements Serializable {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
