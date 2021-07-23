package io.muic.ssc.zork;

import io.muic.ssc.zork.item.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {

    private String roomName;
    private Monster monster;
    public List<Item> items;
    public Map<String, Room> map;


    public Room(String roomName, List<Item> items) {
        this.items = items;
        this.roomName = roomName;
        this.map = new HashMap<>();
        this.monster = new Monster();

    }

    public void setExits(Room north, Room east, Room west, Room south) {
        String[] dir = new String[]{"north", "east", "west", "south"};
        Room[] rooms = new Room[]{north, east, west, south};
        for (int i = 0; i < dir.length; i++) {
            map.put(dir[i], rooms[i]);
        }
    }

    public Monster getMonster() {
        return monster;
    }

    public String getRoomName() {
        return roomName;
    }


}
