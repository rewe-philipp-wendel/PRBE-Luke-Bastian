package com.nentonde.praktikum;

public class NPC extends Person{

    //variables
    String npcType;

    //contructor
    public NPC(String personName, String personRace, String npcType) {
        super(personName, personRace);
        this.npcType = npcType;

    }
}
