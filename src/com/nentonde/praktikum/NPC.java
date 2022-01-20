package com.nentonde.praktikum;

public class NPC extends Person{

    String npcType;

    public NPC(String personName, String personRace, String npcType) {
        super(personName, personRace);
        this.npcType = npcType;

    }
}
