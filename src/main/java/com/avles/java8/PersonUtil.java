package com.avles.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonUtil {

    List<Child> task1(List<Person> personList) {
        return personList.stream().filter(p -> p.age < 18).sorted((p1, p2) -> Integer.compare(p2.age, p1.age) == 0 ? p1.getFirstname().compareTo(p2.getFirstname()) : Integer.compare(p2.age, p1.age)).filter((p) -> !p.getLastname().equals("Kumar")).map(person -> new Child(person.getFirstname(), person.getLastname(), Integer.toString(person.getAge()))).collect(Collectors.toList());
    }

    List<Child> task2(List<Person> personList) {
        return task1(personList).stream().filter(c -> Integer.parseInt(c.age) < 13 && c.firstName.equals("mark")).collect(Collectors.toList());
    }

    Map<String, Child> task3(List<Person> personList) {
        return task1(personList).stream().collect(Collectors.toMap(c -> c.getAge(), c -> c, (c1, c2) -> c1.getFirstName().compareTo(c2.getFirstName()) == -1 ? c2 : c1));
    }
}
