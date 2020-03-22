package com.topics.functional;

import java.util.function.Supplier;

public class _Supplier {
  public static void main(String[] args) {
    //
    System.out.println(getDBConnectionSupplier.get());
  }

  static String getDBConnection(){
      return "jdbc://localhost:4321/users";
  }

  static Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:4321/users";

}


