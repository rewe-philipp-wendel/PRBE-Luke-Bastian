package com.nentonde.praktikum;

import com.nentonde.praktikum.FightActions;
import com.nentonde.praktikum.Class;

public class Main {

    //objects
    static Class class1 = new Class("Klasse 1");
    static Hero hero1 = new Hero("Link","Human", class1, 6, 1, 20, 0.01, 1);
    static Enemy enemy1 = new Enemy("Clark", "Human", "Archer", 1, 6, 1, 0.0);
    static Weapon swordTraining = new Weapon("Trainings Schwert", 3, 0.00, 0, 0);


    public static void main(String[] args) {
        //hero1.setHeroHP(hero1.getHeroBaseHP());
        FightActions.gettingAttacked(enemy1, enemy1.getEnemyCP(), hero1);
        Class.useAction();
    }
}