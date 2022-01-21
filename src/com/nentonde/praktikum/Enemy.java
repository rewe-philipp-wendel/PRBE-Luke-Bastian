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

    public String getEnemyClass() {
        return enemyClass;
    }

    public void setEnemyClass(String enemyClass) {
        this.enemyClass = enemyClass;
    }

    public int getEnemyLevel() {
        return enemyLevel;
    }

    public void setEnemyLevel(int enemyLevel) {
        this.enemyLevel = enemyLevel;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public double getEnemyCP() {
        return enemyCP;
    }

    public void setEnemyCP(double enemyCP) {
        this.enemyCP = enemyCP;
    }

    public double getEnemyCritChance() {
        return enemyCritChance;
    }

    public void setEnemyCritChance(double enemyCritChance) {
        this.enemyCritChance = enemyCritChance;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyClass='" + enemyClass + '\'' +
                ", enemyLevel=" + enemyLevel +
                ", enemyHP=" + enemyHP +
                ", enemyCP=" + enemyCP +
                ", enemyCritChance=" + enemyCritChance +
                ", personName='" + personName + '\'' +
                ", personRace='" + personRace + '\'' +
                '}';
    }
}
