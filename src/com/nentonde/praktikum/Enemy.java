package com.nentonde.praktikum;

public class Enemy extends Person{

    String enemyClass;
    int enemyLevel;
    int enemyHP;
    double enemyCP;
    double enemyCritChance;

    public Enemy(String personName, String personRace, String enemyClass, int enemyLevel, int enemyHP, double enemyCP, double enemyCritChance) {
        super(personName, personRace);
        this.enemyClass = enemyClass;
        this.enemyLevel = enemyLevel;
        this.enemyHP = enemyHP;
        this.enemyCP = enemyCP;
        this.enemyCritChance = enemyCritChance;
    }
}
