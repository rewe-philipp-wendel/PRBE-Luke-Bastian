package com.nentonde.praktikum;

public class Hero extends Person {

    //base variables
    String fighterClass;
    int fighterBaseHP;
    double fighterBaseCP;
    int fighterBaseMP;
    double fighterBaseCritChance;


    //actual variables
    int fighterHP;
    double fighterCP;
    int fighterMP;
    double fighterCritChance;

    //constructor
    public Hero(String personName, String personRace, String fighterClass, int fighterBaseHP, double fighterBaseCP, int fighterBaseMP, double fighterBaseCritChance) {
        super(personRace, personName);
        this.fighterClass = fighterClass;
        this.fighterBaseHP = fighterBaseHP;
        this.fighterBaseCP = fighterBaseCP;
        this.fighterBaseMP = fighterBaseMP;
        this.fighterBaseCritChance = fighterBaseCritChance;
    }

    //getter and setter
    public String getFighterClass() {
        return fighterClass;
    }

    public void setFighterClass(String fighterClass) {
        this.fighterClass = fighterClass;
    }

    public int getFighterBaseHP() {
        return fighterBaseHP;
    }

    public void setFighterBaseHP(int fighterBaseHP) {
        this.fighterBaseHP = fighterBaseHP;
    }

    public double getFighterBaseCP() {
        return fighterBaseCP;
    }

    public void setFighterBaseCP(double fighterBaseCP) {
        this.fighterBaseCP = fighterBaseCP;
    }

    public int getFighterBaseMP() {
        return fighterBaseMP;
    }

    public void setFighterBaseMP(int fighterBaseMP) {
        this.fighterBaseMP = fighterBaseMP;
    }

    public double getFighterBaseCritChance() {
        return fighterBaseCritChance;
    }

    public void setFighterBaseCritChance(double fighterBaseCritChance) {
        this.fighterBaseCritChance = fighterBaseCritChance;
    }

    public int getFighterHP() {
        return fighterHP;
    }

    public void setFighterHP(int fighterHP) {
        this.fighterHP = fighterHP;
    }

    public double getFighterCP() {
        return fighterCP;
    }

    public void setFighterCP(double fighterCP) {
        this.fighterCP = fighterCP;
    }

    public int getFighterMP() {
        return fighterMP;
    }

    public void setFighterMP(int fighterMP) {
        this.fighterMP = fighterMP;
    }

    public double getFighterCritChance() {
        return fighterCritChance;
    }

    public void setFighterCritChance(double fighterCritChance) {
        this.fighterCritChance = fighterCritChance;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "personName='" + personName + '\n' +
                "personRace='" + personRace + '\n' +
                "fighterClass='" + fighterClass + '\n' +
                "fighterBaseHP=" + fighterBaseHP + '\n' +
                "fighterBaseCP=" + fighterBaseCP + '\n' +
                "fighterBaseMP=" + fighterBaseMP + '\n' +
                "fighterBaseCritChance=" + fighterBaseCritChance + '\n' +
                "fighterHP=" + fighterHP + '\n' +
                "fighterCP=" + fighterCP + '\n' +
                "fighterMP=" + fighterMP + '\n' +
                "fighterCritChance=" + fighterCritChance + '\n' +
                '}';
    }
}
