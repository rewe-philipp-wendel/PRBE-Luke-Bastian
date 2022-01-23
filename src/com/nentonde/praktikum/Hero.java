package com.nentonde.praktikum;

public class Hero extends Person {

    //base variables
    String heroClass;
    int heroLevel;
    double heroBaseHP;
    double heroBaseCP;
    int heroBaseMP;
    double heroBaseCritChance;
    double heroBaseResistance;

    //actual variables
    double heroHP;
    double heroCP;
    int heroMP;
    double heroCritChance;
    double heroResistance;

    //Battle variables
    public double heroDamageTaken;


    //constructor
    public Hero(String personName, String personRace, String heroClass, double heroBaseHP, double heroBaseCP, int heroBaseMP, double heroBaseCritChance, double heroBaseResistance) {
        super(personName, personRace);
        this.heroClass = heroClass;
        this.heroBaseHP = heroBaseHP;
        this.heroBaseCP = heroBaseCP;
        this.heroBaseMP = heroBaseMP;
        this.heroBaseCritChance = heroBaseCritChance;
        this.heroBaseResistance = heroBaseResistance;
    }

    //getter and setter
    //base variables
    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public int getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(int heroLevel) {
        this.heroLevel = heroLevel;
    }

    public double getHeroBaseHP() {
        return heroBaseHP;
    }

    public void setHeroBaseHP(double heroBaseHP) {
        this.heroBaseHP = heroBaseHP;
    }

    public double getHeroBaseCP() {
        return heroBaseCP;
    }

    public void setHeroBaseCP(double heroBaseCP) {
        this.heroBaseCP = heroBaseCP;
    }

    public int getHeroBaseMP() {
        return heroBaseMP;
    }

    public void setHeroBaseMP(int heroBaseMP) {
        this.heroBaseMP = heroBaseMP;
    }

    public double getHeroBaseCritChance() {
        return heroBaseCritChance;
    }

    public void setHeroBaseCritChance(double heroBaseCritChance) {
        this.heroBaseCritChance = heroBaseCritChance;
    }

    public double getHeroBaseResistance() {
        return heroBaseResistance;
    }

    public void setHeroBaseResistance(double heroBaseResistance) {
        this.heroBaseResistance = heroBaseResistance;
    }

    //actual variables
    public double getHeroHP() {
        return heroHP;
    }

    public void setHeroHP(double heroHP) {
        this.heroHP = heroHP;
    }

    public double getHeroCP() {
        return heroCP;
    }

    public void setHeroCP(double heroCP) {
        this.heroCP = heroCP;
    }

    public int getHeroMP() {
        return heroMP;
    }

    public void setHeroMP(int heroMP) {
        this.heroMP = heroMP;
    }

    public double getHeroCritChance() {
        return heroCritChance;
    }

    public void setHeroCritChance(double heroCritChance) {
        this.heroCritChance = heroCritChance;
    }

    public double getHeroResistance() {
        return heroResistance;
    }

    public void setHeroResistance(double heroResistance) {
        this.heroResistance = heroResistance;
    }

    //battle variables
    public double getHeroDamageTaken() {
        return heroDamageTaken;
    }

    public void setHeroDamageTaken(double heroDamageTaken) {
        this.heroDamageTaken = heroDamageTaken;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Name: " + personName + '\n' +
                "Race: " + personRace + '\n' +
                "Class: " + heroClass + '\n' +
                "Level: " + heroLevel * '\n' +
                "Base HP: " + heroBaseHP + '\n' +
                "Base CP: " + heroBaseCP + '\n' +
                "Base MP: " + heroBaseMP + '\n' +
                "Base Critchance: " + heroBaseCritChance + '\n' +
                "HP: " + heroHP + '\n' +
                "CP: " + heroCP + '\n' +
                "MP: " + heroMP + '\n' +
                "Critchance: " + heroCritChance +
                '}';
    }
}
