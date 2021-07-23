package io.muic.ssc.zork.item;

public class Bow implements Item{
    @Override
    public String getItemName() {
        return "bow";
    }

    @Override
    public int getAttackPower() {
        return 15;
    }
}
