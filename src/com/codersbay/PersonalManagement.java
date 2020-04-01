package com.codersbay;

import java.util.ArrayList;

public class PersonalManagement {

    static ArrayList<Person> LIST_OF_PEOPLE = new ArrayList<>();

    public static Person createPerson(String firstName, String lastName, String alias, String dateOfBirth, String citizenship, String gender) {

        Person person = new Person(firstName, lastName, alias, dateOfBirth, citizenship, gender);
        return person;

    }

    public static void addPerson(Person person) {

        LIST_OF_PEOPLE.add(person);

    }

    public static void removePerson(Person person) {

        LIST_OF_PEOPLE.remove(person);

    }

    public static void printList() {

        for (Person singlePerson : LIST_OF_PEOPLE) {
            System.out.println(singlePerson.toString());
        }

    }


}
