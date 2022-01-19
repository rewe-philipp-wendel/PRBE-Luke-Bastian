package com.nentonde.praktikum;

public class Person {

    //variables
    String personName;
    String personRace;

    //constructor
    public Person(String personName, String personRace) {
        this.personName = personName;
        this.personRace = personRace;
    }

    //getter and setter
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonRace() {
        return personRace;
    }

    public void setPersonRace(String personRace) {
        this.personRace = personRace;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personRace='" + personRace + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }
}