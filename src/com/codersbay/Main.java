package com.codersbay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> listOfPeople = new ArrayList<>();

        Person ironMan = new Person("Anthony Edward", "Stark", "Iron Man", "on May 23rd 1970", "America", "male");
        Person captainAmerica = new Person("Steven Grant", "Rogers", "Captain America", "on July 4th 1918", "America", "male");
        Person blackWidow = new Person("Natalia Alianovna", "Romanoff", "Black Widow", "on sometime in 1984", "the Soviet Union", "female");
        Person thor = new Person("Thor", "Odinson", "Thor", "between 964 A.D.-965 A.D.", "Asgard", "male");
        Person hulk = new Person("Robert Bruce", "Banner", "the Hulk", "on December 18th 1969", "America", "male");
        Person hawkeye = new Person("Clint Francis", "Barton", "Hawkeye", "on an unknown date", "America", "male");

        ironMan.printPersonDetails();
        captainAmerica.printPersonDetails();
        blackWidow.printPersonDetails();
        thor.printPersonDetails();
        hulk.printPersonDetails();
        hawkeye.printPersonDetails();

        listOfPeople.add(ironMan);
        listOfPeople.add(captainAmerica);
        listOfPeople.add(blackWidow);
        listOfPeople.add(thor);
        listOfPeople.add(hulk);
        listOfPeople.add(hawkeye);

        listOfPeople.remove(ironMan);
        listOfPeople.remove(blackWidow);

        for (Person singlePerson : listOfPeople) {
            System.out.println(singlePerson.toString());
        }

    }

}
