package com.plantpocalypse;

public class ActionGreenHouseOne implements Action {
    @Override
    public void entryEvent(Player player, Room room) {
        PlantMonster monster = new PlantMonster("Cactus", 10);
        monster.attackPlayer(player);
    }
}
