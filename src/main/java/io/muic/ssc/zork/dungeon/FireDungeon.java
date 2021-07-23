package io.muic.ssc.zork.dungeon;

import io.muic.ssc.zork.Room;
import io.muic.ssc.zork.item.*;

import java.util.ArrayList;
import java.util.List;

public class FireDungeon extends Dungeon {
    private io.muic.ssc.zork.item.Dagger Dagger = new Dagger();
    private io.muic.ssc.zork.item.Bow Bow = new Bow();
    private Sword sword = new Sword();
    private Pistol pistol = new Pistol();
    private Katana katana = new Katana();

    @Override
    protected void createRooms() {
        List<Item> leftRoomItems = new ArrayList<>();
        leftRoomItems.add(Dagger);
        leftRoomItems.add(Bow);

        List<Item> rightRoomItems = new ArrayList<>();
        rightRoomItems.add(sword);
        rightRoomItems.add(pistol);

        List<Item> hiddenRoomItems = new ArrayList<>();
        hiddenRoomItems.add(katana);

        Room centerRoom = new Room("Center Room", null);

        Room rightRoom = new Room("Right Room", rightRoomItems);
        Room leftRoom = new Room("Left Room", leftRoomItems);
        Room hiddenRoom = new Room("Hidden Room", hiddenRoomItems);

        centerRoom.setExits(hiddenRoom, rightRoom, leftRoom, null);
        rightRoom.setExits(null, null, centerRoom, null);
        leftRoom.setExits(null, centerRoom, null, null);
        hiddenRoom.setExits(null, null, null, centerRoom);

        curRoom = centerRoom;
    }

    @Override
    public String getMapName() {
        return "FireDungeon";
    }
}
