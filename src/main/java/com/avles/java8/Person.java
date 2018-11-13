package com.avles.java8;

public class Person {

    String fullName;
    int age;
    String qualification;

    public Person(String fullName, int age, String qualification) {
        this.fullName = fullName;
        this.age = age;
        this.qualification = qualification;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getFirstname(){
        return  this.fullName.split(" ")[0];
    }

    public String getLastname(){
        return  this.fullName.split(" ")[1];
    }
}
