package com.devsirlocust.reactive.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTests {
  private Calculator calculator;

  @BeforeEach
  void setup() {
    this.calculator = new Calculator();
  }

  @ParameterizedTest()
  @CsvSource({ "10,100,10", "20, 40,2" })
  void testDivideFunction(int result, int num1, int num2) {
    assertEquals(result, calculator.divideFunction(num1, num2));
  }

  @ParameterizedTest()
  @CsvSource({ "25,5,5", "-9, -3,3", "0, 1,0" })
  void testMultiplyFunction(int result, int num1, int num2) {
    assertEquals(result, calculator.multiplyFunction(num1, num2));
  }

  @ParameterizedTest()
  @CsvSource({ "-10,-5,-5", "10, 5,5", "3, 5, -2" })
  void testSumFunctional(int result, int num1, int num2) {
    assertEquals(result, calculator.sumFunctional(num1, num2));
  }
}
