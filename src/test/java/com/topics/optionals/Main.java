package com.topics.optionals;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {
    Supplier<IllegalStateException> throwException = () -> new IllegalStateException("Exception");
    Object value = Optional.ofNullable("Hello").orElseThrow(throwException);

      Consumer<String> stringConsumer = email -> System.out.println("SENDING EMAIL TO " + email);
      Runnable cannot_send_email = () -> System.out.println("CANNOT SEND EMAIL");
      Optional.ofNullable("EMAIL")
        .ifPresentOrElse(
                stringConsumer,
                cannot_send_email);

    // System.out.println(value);
  }
}
