package com.nentonde.praktikum;

import java.util.Scanner;

public class Class {

    /*Classes + actions
    Support/Mage: Healing a teammate
    Knight: Superslash (Deals double the damage to 2 enemies)
    Archer: Arrowrain (attacks all enemies with an 0.5 multiplier of the standart attack damage)

     */
    String classClassName;
    String classClassAction;

    //contructor
    public Class(String classClassName) {
        this.classClassName = classClassName;
    }

    //getter and setter
    public String getClassClassName() {
        return classClassName;
    }
    public void setClassClassName(String classClassName) {
        this.classClassName = classClassName;
    }
    public String getClassClassAction() {
        return classClassAction;
    }
    public void setClassClassAction(String classClassAction) {
        this.classClassAction = classClassAction;
    }

    //methods
    public static void useAction(){
        Scanner scanner = new Scanner(System.in);
    }
}
