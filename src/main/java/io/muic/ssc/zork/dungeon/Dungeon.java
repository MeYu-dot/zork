package io.muic.ssc.zork.dungeon;

import io.muic.ssc.zork.Room;

public abstract class Dungeon {
    public void initialize() {
        createRooms();
    }
    public Room curRoom;
    protected abstract void createRooms();
    public abstract String getMapName();

    public Room go(String dir) {
        if (dir.equals("")) {
            System.out.println("where?");
            return null;
        }
        Room nextRoom = null;
        for (String i : curRoom.map.keySet()) {
            if (curRoom.equals(i)) {
                nextRoom = curRoom.map.get(i);
            }
        }
        if (nextRoom == null) {
            System.out.println("No door!");
        } else {
            curRoom = nextRoom;
            System.out.println("this is: " + curRoom.getRoomName());
        }
        return nextRoom;
    }
}
