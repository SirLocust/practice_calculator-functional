package com.devsirlocust.reactive.calculator;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Calculator {

  public Integer sumFunctional(Integer num1, Integer num2) {

    return (num1 >= 0 && num2 >= 0) ? (int) Stream.concat(fill(num1), fill(num2)).count() : num1 - (-num2);
  }

  public Stream<Integer> fill(Integer num) {
    return IntStream.iterate(num, i -> num).limit(Math.abs(num)).boxed();
  }

  public Integer subtractionFunctional(Integer num1, Integer num2) {
    return num1 - num2;
  }

  // descriptiva
  public Integer multiplyFunction(Integer num1, Integer num2) {
    return IntStream.iterate(num1, i -> num1).limit(num2).sum();
  }
  // recursividad

  public Integer divideFunction(Integer dividiend, Integer divisor) {
    var result = dividiend;
    return (result <= 0) ? 0 : (divisor > 0) ? 1 + divideFunction(subtractionFunctional(result, divisor), divisor) : -1;
  }
}
