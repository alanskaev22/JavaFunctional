package com.topics.combinatorpattern;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    //

    Customer alan =
        Customer.builder()
            .name("Alan")
            .email("Alangmail.com")
            .phoneNumber("+7323")
            .dob(LocalDate.of(1995, 7, 19))
            .build();
    CustomerValidatorService validatorService = new CustomerValidatorService();
    // System.out.println(validatorService.isValid(alan));

    // Combinator pattern
    CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid().and(CustomerRegistrationValidator.isPhoneNumberValid()).and(CustomerRegistrationValidator.isAdult()).apply(alan);
    System.out.println(result);
  }
}
