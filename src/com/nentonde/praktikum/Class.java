package com.nentonde.praktikum;

import java.util.Scanner;

public class Class {

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
