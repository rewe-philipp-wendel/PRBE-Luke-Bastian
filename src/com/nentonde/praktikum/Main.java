package com.nentonde.praktikum;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner mainScanner = new Scanner(System.in);
    static Random mainRandom = new Random();

    //objects
    static Class class1 = new Class("Klasse 1");
    static Hero hero1 = new Hero("Link", "Human", class1, 6, 1, 20, 1, 1);
    static Enemy enemy1 = new Enemy("Clark", "Human", "Archer", 1, 6, 1, 0.0);
    static Weapon swordTraining = new Weapon("Trainings Schwert", 3, 0);

    //arrays
    public static Class[] classIndex = new Class[]{class1};
    public static Hero[] heroIndex = new Hero[]{hero1};
    public static Enemy[] enemyIndex = new Enemy[]{enemy1};

    public static void main(String[] args) {

        /*Class[] classes = new Class[1];
        classes[0] = class1;
        */

        FightActions.chooseHero();
        FightActions.attack(Convert.toEnemy(mainRandom.nextInt(enemyIndex.length - 1)));

        while (true) {

        }
        //hero1.setHeroHP(hero1.getHeroBaseHP());
        //FightActions.gettingAttacked(enemy1, enemy1.getEnemyCP(), hero1);
    }
}