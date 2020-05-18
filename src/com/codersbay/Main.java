package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person ironMan = PersonalManagement.createPerson("Anthony Edward", "Stark", "Iron Man", "on May 23rd 1970", "America", "male");
        Person captainAmerica = PersonalManagement.createPerson("Steven Grant", "Rogers", "Captain America", "on July 4th 1918", "America", "male");
        Person blackWidow = PersonalManagement.createPerson("Natalia Alianovna", "Romanoff", "Black Widow", "on sometime in 1984", "the Soviet Union", "female");
        Person thor = PersonalManagement.createPerson("Thor", "Odinson", "Thor", "between 964 A.D.-965 A.D.", "Asgard", "male");
        Person hulk = PersonalManagement.createPerson("Robert Bruce", "Banner", "the Hulk", "on December 18th 1969", "America", "male");
        Person hawkeye = PersonalManagement.createPerson("Clint Francis", "Barton", "Hawkeye", "on an unknown date", "America", "male");

        PersonalManagement.addPerson(ironMan);
        PersonalManagement.addPerson(captainAmerica);
        PersonalManagement.addPerson(blackWidow);
        PersonalManagement.addPerson(thor);
        PersonalManagement.addPerson(hulk);
        PersonalManagement.addPerson(hawkeye);

        PersonalManagement.printList();

        PersonalManagement.removePerson(ironMan);
        PersonalManagement.removePerson(blackWidow);

        System.out.println("------------------------");
        PersonalManagement.printList();


    }

}
