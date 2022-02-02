package com.nentonde.praktikum;

public class Convert {


    public Convert() {

    }

    //toHero
    public static Hero nameToHero(String heroName) {

        for (int i = 0; i < Main.heroIndex.length; i++) {
            if (heroName.equals(Main.heroIndex[i].personName)) {
                return Main.heroIndex[i];
            }
        }
        System.out.println("Dieser Held existiert nicht");
        return null;
    }

    public static Hero idToHero(int heroNumber) {

        if (heroNumber < Main.heroIndex.length) {
            return Main.heroIndex[heroNumber];
        } else {
            System.out.println("Dieser Held existiert nicht");
            return null;
        }

    }

    //toEnemy
    public static Enemy nameToEnemy(String enemyName) {

        for (int i = 0; i < Main.heroIndex.length; i++) {
            if (enemyName == Main.heroIndex[i].personName) {
                return Main.enemyIndex[i];
            }
        }
        System.out.println("Dieser Gegner existiert nicht");
        return null;
    }

    public static Enemy idToEnemy(int enemyId) {

        if (enemyId < Main.enemyIndex.length) {
            return Main.enemyIndex[enemyId];
        } else {
            System.out.println("Dieser Gegner existiert nicht");
            return null;
        }

    }

}
