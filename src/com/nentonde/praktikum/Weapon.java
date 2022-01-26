package com.nentonde.praktikum;

public class Weapon {

    String weaponName;
    double weaponCombatDamage;
    int weaponCritChance;
    double weaponMagicDamage;
    int weaponMagicUsage;

    //constructor
    public Weapon(String weaponName, double weaponCombatDamage, int weaponCritChance) {
        this.weaponName = weaponName;
        this.weaponCombatDamage = weaponCombatDamage;
        this.weaponCritChance = weaponCritChance;
    }

    //getter and setter
    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public double getWeaponCombatDamage() {
        return weaponCombatDamage;
    }

    public void setWeaponCombatDamage(double weaponCombatDamage) {
        this.weaponCombatDamage = weaponCombatDamage;
    }

    public int getWeaponCritChance() {
        return weaponCritChance;
    }

    public void setWeaponCritChance(int weaponCritChance) {
        this.weaponCritChance = weaponCritChance;
    }

    public double getWeaponMagicDamage() {
        return weaponMagicDamage;
    }

    public void setWeaponMagicDamage(double weaponMagicDamage) {
        this.weaponMagicDamage = weaponMagicDamage;
    }

    public int getWeaponMagicUsage() {
        return weaponMagicUsage;
    }

    public void setWeaponMagicUsage(int weaponMagicUsage) {
        this.weaponMagicUsage = weaponMagicUsage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", weaponCombatDamage=" + weaponCombatDamage +
                ", weaponCritChance=" + weaponCritChance +
                ", weaponMagicDamage=" + weaponMagicDamage +
                ", weaponMagicUsage=" + weaponMagicUsage +
                '}';
    }
}
