package io.muic.ssc.zork.item;

public class Pistol implements Item {
    @Override
    public String getItemName() {
        return "pistol";
    }

    @Override
    public int getAttackPower() {
        return 25;
    }
}
