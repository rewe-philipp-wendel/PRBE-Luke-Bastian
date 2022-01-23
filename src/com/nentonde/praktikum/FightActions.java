package com.nentonde.praktikum;

public class FightActions {


    public static void attack(Enemy enemy) {

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
