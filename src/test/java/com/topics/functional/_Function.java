package com.topics.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
  public static void main(String[] args) {
    int num = 3;
    // Function
    Function<Integer, Integer> incrementByTwo = number -> number + num;
    Function<Integer, Integer> multiplyByTen = number -> number * 10;
    incrementByTwo.apply(num);

    Function<Integer, Integer> incrementByTwoThenMultiply = incrementByTwo.andThen(multiplyByTen);

    Integer incrementThenMultiply = incrementByTwoThenMultiply.apply(num);
    System.out.println(incrementThenMultiply);

    // BiFunction
    BiFunction<Integer, Integer, Integer> incrementAndMply =
        (increment, multiply) -> (increment + num) * multiply;
    Integer biFunction = incrementAndMply.apply(3, 10);
    System.out.println(biFunction);

    Function<Integer, Integer> divideByFive = number -> number / 5;

    Integer biFunction2 = incrementAndMply.andThen(divideByFive).apply(num, 10);
    System.out.println(biFunction2);
  }
}
