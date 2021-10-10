package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStream {

    public static void main(String[] args) {

        List<Person> people = getPeople();
        //Imperative approach ❌
        List<Person> female = new ArrayList<>();
        for(Person p: people){
            if (p.getGender().equals(Gender.FEMALE)){
                female.add(p);
            }
        }

        //female.forEach(System.out::println);
        //Declarative approach ✅

        //filter
        List<Person> male = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
       // male.forEach(System.out::println);
        //sort
       List<Person> sorted =  people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());
       //sorted.forEach(System.out::println);
        //all match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 100);
        //System.out.println(allMatch);
        //any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 60);
        //System.out.println(anyMatch);
        //non match
        boolean nonMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Saul Figueroa"));
        //System.out.println(nonMatch);
        //max
        people.stream()
                .max(Comparator.comparing(Person:: getAge))
                .ifPresent(person -> {
                    System.out.println(person);
                });
        //min
        people.stream()
                .min(Comparator.comparing(Person:: getAge))
                .ifPresent(person -> {
                    System.out.println(person);
                });
        //group
        Map<Gender, List<Person>> groupByGender   = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//        });

       Optional<String> oldesFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

       oldesFemaleAge.ifPresent(System.out::println);


    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Saul Figueroa",26,Gender.MALE),
                new Person("Sam Smith",21,Gender.MALE),
                new Person("James B",43,Gender.MALE),
                new Person("Jaime C",24,Gender.MALE),
                new Person("Hector Harrison",65,Gender.MALE),
                new Person("Andrea Kath",56,Gender.FEMALE),
                new Person("Kelly Ellis",33,Gender.FEMALE)
        );
    }
}
