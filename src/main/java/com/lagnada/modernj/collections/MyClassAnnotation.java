package com.lagnada.modernj.collections;

// Define the annotation
public @interface MyClassAnnotation {
  // Define a single element with a default value
  String value() default "Default value";
}

