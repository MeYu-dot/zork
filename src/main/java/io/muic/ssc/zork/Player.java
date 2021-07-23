package io.muic.ssc.zork;

import io.muic.ssc.zork.item.Item;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private int maxHP;
    private int curHP;
    private int attackPower;
//    private int pRow;
//    private int pCol;
    private boolean alive;
    private List<Item> items;

    public Player() {
        this.maxHP = 100;
        this.curHP = this.maxHP;
        this.attackPower = 5;
        this.alive = true;
        this.items = new ArrayList<>();
//        this.inventory = new Inventory();
//        this.setPlayerPosition(pRow, pCol);
    }

    //add ap everytime the player kills a monster
    private void incrementAP() {
        this.attackPower += 2;
    }

    private void takeDamage(int damage) {
        this.curHP -= damage;
        if (this.curHP <= 0) {
            setDead();
        }
    }

    private void take(Item item) {

        if (item != null) {
            items.add(item);
        }
    }

    private Item getItem(String item) {
        for (Item each : items) {
            if (each.getItemName().equals(item)) {
                return each;
            }
        }
        return null;
    }

    private void drop(String item) {
        Item itemItem = getItem(item);
        if (itemItem == null) {
            System.out.println("No " + item + " found in player");
        } else {
            items.remove(itemItem);
        }
    }
    public int attackWith(String weapon) {
        Item item = getItem(weapon);
        if (item != null) {
            System.out.println(item + " is not found. Attack with fist instead.");
            return this.attackPower;

        }
        return item.getAttackPower()+this.attackPower;
    }

    public void incrementHP() {
        this.curHP += 15;
        if (this.curHP > this.maxHP) {
            this.curHP = this.maxHP;
        }

        System.out.println("HP + 15");
        System.out.printf(" HP:%d/%d", this.curHP, this.maxHP);
    }

    private void setDead() {
        this.alive = false;
    }

    public int getMaxHP() {
        return maxHP;
    }
    public int getCurHP() {
        return curHP;
    }
    public int getAttackPower() {
        return attackPower;
    }

    public boolean isAlive() {
        return alive;
    }

}
