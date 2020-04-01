package com.codersbay;

public class Person {

    public String firstName;
    public String lastName;
    public String alias;
    public String dateOfBirth;
    public String citizenship;
    public String gender;


    Person(String firstName, String lastName, String alias, String dateOfBirth, String citizenship, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
        this.gender = gender;
    }

    Person(String firstName, String lastName, String dateOfBirth, String citizenship, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alias='" + alias + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
