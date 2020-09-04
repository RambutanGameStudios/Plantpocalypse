package com.plantpocalypse.events;

import com.plantpocalypse.Player;
import com.plantpocalypse.Room;

public class ActionFoyer implements Action {
    @Override
    public void entryEvent(Player player, Room room) {
        System.out.println("You look in awe at the multitude of exotic plants in the grand entry of the mansion.");
    }
}