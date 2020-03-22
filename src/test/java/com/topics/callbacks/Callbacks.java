package com.topics.callbacks;

import java.util.function.Consumer;

public class Callbacks {
  public static void main(String[] args) {

    hello(
        "ALAN",
        null,
        value -> {
          System.out.println("NO LAST NAME PROVIDED FOR " + value);
        });

    hello2(
        "ALAN",
        null,
        () -> {
          System.out.println("NO LAST NAME PROVIDED");
        });
    //
  }

  static void hello(String firstName, String lastName, Consumer<String> callback) {
    System.out.println(firstName);
    if (lastName != null) {
      System.out.println(lastName);
    } else {
      callback.accept(firstName);
    }
  }

  static void hello2(String firstName, String lastName, Runnable callback) {
    System.out.println(firstName);
    if (lastName != null) {
      System.out.println(lastName);
    } else {
      callback.run();
    }
  }
}
