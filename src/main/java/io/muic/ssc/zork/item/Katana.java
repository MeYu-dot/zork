package io.muic.ssc.zork.item;

public class Katana implements Item{
    @Override
    public String getItemName() {
        return "katana";
    }

    @Override
    public int getAttackPower() {
        return 45;
    }
}
