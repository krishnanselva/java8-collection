package com.avles.java8;

public class Child {

    String firstName;
    String age;
    String lastName;

    public Child(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
