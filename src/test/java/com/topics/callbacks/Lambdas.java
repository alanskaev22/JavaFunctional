package com.topics.callbacks;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
  public static void main(String[] args) {
    //
      Function<String, String> printName = String::toUpperCase;
    System.out.println(printName.apply("Alan"));

      BiFunction<String, Integer, String> example = (name, age) -> {
          System.out.println("INPUT: "+name);
          System.out.println(age);
          return name.toUpperCase();
      };

    System.out.println(example.apply("Alan", 33));
  }
}
