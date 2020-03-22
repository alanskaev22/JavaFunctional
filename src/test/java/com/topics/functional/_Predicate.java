package com.topics.functional;

import java.util.function.Predicate;

public class _Predicate {
  public static void main(String[] args) {

    System.out.println("without Predicate");
      System.out.println(isPhoneNumberValid("7323971248"));
      System.out.println(isPhoneNumberValid("2323971248"));

    System.out.println("With Predicate");
      System.out.println(isPhoneValidPredicate.test("2323971248"));

    System.out.println("Two Predicates");
      System.out.println(isPhoneValidPredicate.and(containsThreePredicate).test("2323971248"));
      System.out.println(isPhoneValidPredicate.and(containsThreePredicate).test("77732397124")); // contains 3, starts w/7 and has 11 chars
      System.out.println(isPhoneValidPredicate.or(containsThreePredicate).test("2323971248"));
  }
  static boolean isPhoneNumberValid(String phoneNum){
      return phoneNum.startsWith("7") && phoneNum.length() == 11;
  }

  static Predicate<String> isPhoneValidPredicate = phoneNum ->
          phoneNum.startsWith("7") && phoneNum.length() == 11;

  static Predicate<String> containsThreePredicate = phoneNum ->
          phoneNum.contains("3");


}
