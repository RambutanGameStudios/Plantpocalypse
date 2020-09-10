package com.plantpocalypse.util.reader;


import com.plantpocalypse.model.Room;
import com.plantpocalypse.util.reader.AdjacentRoomReader;
import com.plantpocalypse.util.reader.ItemReader;
import com.plantpocalypse.util.reader.RoomReader;

import java.util.HashMap;
import java.util.Map;

public class TestReaders {
    public static void main(String[] args) {
        RoomReader readRooms = new RoomReader();
        AdjacentRoomReader readAdjacentRooms = new AdjacentRoomReader();
        ItemReader readItems = new ItemReader();

        HashMap<String, Room> rooms = readRooms.readRoomsXML("./resources/newGame/rooms.xml");
        readAdjacentRooms.readAdjacentRoomsXML("./resources/newGame/adjacentRooms.xml",rooms);
        readItems.readItemsXML("./resources/newGame/items.xml",rooms);
        for (Map.Entry entry : rooms.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //System.out.println(rooms.get("Foyer").getNeighboringRooms());
        rooms.get("Outside").getItems().values().forEach( item -> System.out.println(item.getName()));


    }
}
