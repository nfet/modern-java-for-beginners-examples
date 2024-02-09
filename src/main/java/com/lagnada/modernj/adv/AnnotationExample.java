package com.lagnada.modernj.adv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Using the custom annotation
public class AnnotationExample {

  @MyCustomAnnotation(description = "This method does something special")
  public void specialMethod() {
    System.out.println("Executing special method.");
  }

  public static void main(String[] args) throws Exception {
    AnnotationExample example = new AnnotationExample();
    MyCustomAnnotation annotation = example.getClass()
            .getMethod("specialMethod")
            .getAnnotation(MyCustomAnnotation.class);

    System.out.println("Method Description: " + annotation.description());
    example.specialMethod();
  }
}

// Defining a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation {
  String description() default "No description";
}
