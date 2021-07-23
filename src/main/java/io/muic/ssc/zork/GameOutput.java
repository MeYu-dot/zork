package io.muic.ssc.zork;

import com.sun.tools.javac.util.StringUtils;
import io.muic.ssc.zork.item.Item;

import java.util.List;

public class GameOutput {
    public void println(String message) {
        System.out.println(message);
    }

    public void printStartingScreen() {
        System.out.println("----------WELCOME TO ZORK-----------");
        System.out.println("----------This is a starting screen-----------");
        System.out.println("-------Please choose a map-------");
        System.out.println("--------Ice Dungeon  or  Fire Dungeon--------");
    }

    public void printPlayerInfo(Player player) {
        System.out.println("PLAYER'S STAT");
        System.out.printf(" HP:%d/%d", player.getCurHP(), player.getMaxHP());
        System.out.println(" Attack Power: " + player.getAttackPower());
//        System.out.println("  Item in player:");
//        printItem(player.items);
    }

    public void printMonsterInfo(Monster monster) {
        System.out.println("MONSTER'S STAT");
        System.out.printf(" HP:%d/%d", monster.getCurHP(), monster.getMaxHP());
        System.out.println(" Attack Power: " + monster.getAttackPower());
    }

    public void printRoomInfo(Room curRoom) {
        System.out.println("ROOM");
        System.out.println("  this room is: " + curRoom.getRoomName());
        for (String direction : curRoom.map.keySet()) {
            Room room = curRoom.map.get(direction);
            if (room != null) {
                System.out.printf("  %s's %s: %s\n", curRoom.getRoomName(), direction, room.getRoomName());
            }
        }
    }
    private void printItem(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("    None");
        } else {
            for (Item eachItem : items) {
                System.out.printf("    %s:\n", StringUtils.capitalize(eachItem.getItemName()));
                System.out.println("      Attack power: " + eachItem.getAttackPower());
                System.out.println("      Defense power: " + eachItem.getDefensePower());
                System.out.println("      Boost power: " + eachItem.getBoostPower());
            }
        }
    }

}
