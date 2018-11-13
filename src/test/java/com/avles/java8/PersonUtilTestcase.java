package com.avles.java8;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonUtilTestcase {
    PersonUtil personUtil = new PersonUtil();
    private List<Person> getPersonList() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("mark waugh", 11, "year 6"));
        personList.add(new Person("mark wass", 12, "year 7"));
        personList.add(new Person("Gavin Marriott", 13, "year 8"));
        personList.add(new Person("Richard Sutcliffe", 14, "year 9"));
        personList.add(new Person("Scott Kumar", 15, "year 10"));
        personList.add(new Person("Zen Coupland", 16, "year 11"));
        personList.add(new Person("Ben Coupland", 16, "year 11"));
        personList.add(new Person("Adam Scott", 17, "GCSE"));
        personList.add(new Person("Brad Claydon", 18, "A level"));
        personList.add(new Person("Dylan Cross", 23, "Bachelor of Arts"));
        return personList;
    }

    @Test
    public void testTask1() {
        List<Person> personList = getPersonList();

        List<Child> childList = personUtil.task1(personList);
        childList.stream().forEach(c -> System.out.println(c.getFirstName()+" "+c.getLastName()+" "+c.getAge()));
        System.out.println("----------------------------");
        Assertions.assertEquals(7,childList.size());

    }
    @Test
    public void testTask2() {
        List<Person> personList = getPersonList();

        List<Child> childList = personUtil.task2(personList);
        childList.stream().forEach(c -> System.out.println(c.getFirstName()+" "+c.getLastName()+" "+c.getAge()));
        System.out.println("----------------------------");
        Assertions.assertEquals(2,childList.size());

    }
    @Test
    public void testTask3() {
        List<Person> personList = getPersonList();

        Map<String,Child> childList = personUtil.task3(personList);
        childList.forEach((a,c) -> System.out.println(c.getFirstName()+" "+c.getLastName()+" "+c.getAge()));
        Assertions.assertEquals(6,childList.size());

    }
}
