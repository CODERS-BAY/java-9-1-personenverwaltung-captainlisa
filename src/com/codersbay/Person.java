package com.codersbay;

public class Person {

    public String firstName;
    public String lastName;
    public String alias;
    public String dateOfBirth;
    public String citizenship;
    public String gender;


    public Person(String firstName, String lastName, String alias, String dateOfBirth, String citizenship, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
        this.gender = gender;
    }



    public void printPersonDetails() {
        System.out.println(this.alias + "'s real name is " + this.firstName + " " + this.lastName + " was born " + this.dateOfBirth + " in " + this.citizenship + " and was born " + this.gender + ".");
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
