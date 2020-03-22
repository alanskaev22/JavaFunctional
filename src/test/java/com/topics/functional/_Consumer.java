package com.topics.functional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
  public static void main(String[] args) {

    Customer alan = Customer.builder().customerName("Alan").customerPhoneNum("732").build();
    greetCustomer(alan);

    Consumer<Customer> greetCustomerConsumer = customer -> greetCustomer(customer);
    greetCustomerConsumer.accept(alan);

    BiConsumer<Customer, Boolean> greetCustomerConsumer2 =
        (customer, show) ->
            System.out.println(
                "Hello "
                    + customer.getCustomerName()
                    + ", Thanks for registering phone "
                    + (show ? customer.getCustomerPhoneNum() : "***"));
    greetCustomerConsumer2.accept(alan, false);
  }

  static void greetCustomer(Customer customer) {
    System.out.println(
        "Hello "
            + customer.getCustomerName()
            + ", Thanks for registering phone "
            + customer.getCustomerPhoneNum());
  }

  @Data
  @AllArgsConstructor
  @Builder
  public static class Customer {
    private String customerName;
    private String customerPhoneNum;
  }
}
