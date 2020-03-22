package com.topics.streams;

import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class _Stream {
  public static void main(String[] args) {
    Person alan = Person.builder().name("Alan").gender(Gender.MALE).build();
    Person alina = Person.builder().name("Alina").gender(Gender.FEMALE).build();
    Person albert = Person.builder().name("Albert").gender(Gender.MALE).build();
    Person john = Person.builder().name("John").gender(Gender.MALE).build();
    Person mary = Person.builder().name("Mary").gender(Gender.FEMALE).build();
    List<Person> people = Arrays.asList(alan, alina, albert, john, mary);

    ToIntFunction<String> length = String::length;
    IntConsumer println = System.out::println;
    Function<Person, String> personStringFunction = person -> person.getName();

    people.stream().map(personStringFunction).mapToInt(length).forEach(println);
    Predicate<Person> containsFemalePredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.getGender());
    boolean onlyFemaleBool = people.stream().noneMatch(containsFemalePredicate);
    System.out.println(onlyFemaleBool);
  }

  @Data
  @Builder
  static class Person {
    private String name;
    private Gender gender;
  }

   enum Gender {
    MALE,
    FEMALE,
    PREFER_NOT_TO_SAY;
  }
}
