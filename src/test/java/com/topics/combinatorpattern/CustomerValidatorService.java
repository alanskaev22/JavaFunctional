package com.topics.combinatorpattern;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
public class CustomerValidatorService {

  private boolean isEmailValid(String email) {
    return email.contains("@");
  }

  private boolean isPhoneValid(String phoneNumber) {
    return phoneNumber.startsWith("+7");
  }

  private boolean isAdult(LocalDate dob) {
    return Period.between(dob, LocalDate.now()).getYears() > 18;
  }

  public boolean isValid(Customer customer) {
    return isEmailValid(customer.getEmail())
        && isPhoneValid(customer.getPhoneNumber())
        && isAdult(customer.getDob());
  }
}
