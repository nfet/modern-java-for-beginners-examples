package com.lagnada.modernj;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {

  public static Stream<Object[]> data() {
    return Stream.of(
            new Object[]{1, 2, 3},
            new Object[]{2, 3, 5},
            new Object[]{3, 4, 7}
    );
  }

  @ParameterizedTest
  @MethodSource("data")
  public void testAdditionWithParameters(int a, int b, int expectedSum) {
    Calculator calculator = new Calculator();
    assertEquals(expectedSum, calculator.add(a, b));
  }
}

class Calculator {
  public int add(int a, int b) {
    return a + b;
  }
}
