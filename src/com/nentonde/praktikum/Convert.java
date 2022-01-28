package com.nentonde.praktikum;

public class Convert {


    public Convert() {

    }

    //toHero
    public static Hero toHero(String heroName) {

        for (int i = 0; i < Main.heroIndex.length; i++) {
            if (heroName == Main.heroIndex[i].personName) {
                return Main.heroIndex[i];
            }
        }
        System.out.println("Dieser Held existiert nicht");
        return null;
    }

    public static Hero toHero(int heroNumber) {

        if (heroNumber < Main.heroIndex.length) {
            return Main.heroIndex[heroNumber];
        } else {
            System.out.println("Dieser Held existiert nicht");
            return null;
        }

    }

    //toEnemy
    public static Enemy toenemy(String enemyName) {

        for (int i = 0; i < Main.heroIndex.length; i++) {
            if (enemyName == Main.heroIndex[i].personName) {
                return Main.enemyIndex[i];
            }
        }
        System.out.println("Dieser Gegner existiert nicht");
        return null;
    }

    public static Enemy toEnemy(int enemyNumber) {

        if (enemyNumber < Main.enemyIndex.length) {
            return Main.enemyIndex[enemyNumber];
        } else {
            System.out.println("Dieser Gegner existiert nicht");
            return null;
        }

    }

}
