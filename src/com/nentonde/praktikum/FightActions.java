package com.nentonde.praktikum;

import java.util.Random;

public class FightActions {

    private static Random random = new Random();

    public static void attack(Hero hero, Enemy enemy) {
        int critProb = random.nextInt(100);
        if(critProb == hero.heroBaseCritChance){
            System.out.println(hero.getPersonName() + " hat einen kritischen Treffer gelandet");
        }
        else {
            System.out.println(hero.getPersonName() + " hat einen normalen Treffer gelandet");
        }
    }

    public static void gettingAttacked(Enemy enemy, double damage, Hero hero){
        System.out.println(hero.getPersonName() + " wird von " + enemy.getPersonName() + " für " + damage + " damage angegriffen!");
        hero.setHeroDamageTaken(hero.getHeroDamageTaken() + enemy.enemyCP);
        hero.setHeroHP(hero.getHeroBaseHP() - hero.getHeroDamageTaken());
        System.out.println(hero.getPersonName() + "Hat noch " + hero.getHeroHP() + " HP");
        if(hero.getHeroHP() == 0){
            System.out.println(hero.getPersonName() + " wurde getötet!");
        }
    }

    public static void action(Hero hero){

    }

    public static void useItem(Item item){

    }

}
