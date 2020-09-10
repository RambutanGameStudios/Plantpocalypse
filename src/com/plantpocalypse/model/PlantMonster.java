package com.plantpocalypse.model;

import java.io.Serializable;

public class PlantMonster implements Serializable {
    private String monsterName;
    private int baseAttack = 2;
    private String monsterDescription;

    /* CONSTRUCTORS */
    public PlantMonster() {}
    public PlantMonster(String monsterName){
        setMonsterName(monsterName);
    }

    public PlantMonster(String monsterName, int baseAttack){
        setMonsterName(monsterName);
        setBaseAttack(baseAttack);
    }

    /* BUSINESS METHODS */
   public void attackPlayer(Player player){
       if (player != null) {
           player.getHurt(getBaseAttack());
       }
   }

    /* GETTERS AND SETTERS */
    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }
}
