package io.muic.ssc.zork.item;

public class Sword implements Item{
    @Override
    public String getItemName() {
        return "Sword";
    }

    @Override
    public int getAttackPower() {
        return 30;
    }

}
