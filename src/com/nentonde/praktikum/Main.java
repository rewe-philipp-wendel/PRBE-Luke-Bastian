package com.nentonde.praktikum;

import java.util.Scanner;

public class Main {

    Scanner mainScanner = new Scanner(System.in);

    //objects
    static Class class1 = new Class("Klasse 1");
    static Hero hero1 = new Hero("Link","Human", class1, 6, 1, 20, 1, 1);
    static Enemy enemy1 = new Enemy("Clark", "Human", "Archer", 1, 6, 1, 0.0);
    static Weapon swordTraining = new Weapon("Trainings Schwert", 3, 0);



    public static void main(String[] args) {

        Class[] classes = new Class[1];
        classes[0] = class1;

        while(true){

        }
        //hero1.setHeroHP(hero1.getHeroBaseHP());
        //FightActions.gettingAttacked(enemy1, enemy1.getEnemyCP(), hero1);
    }
}