package io.muic.ssc.zork.item;

public class Dagger implements Item{
    @Override
    public String getItemName() {
        return "dagger";
    }

    @Override
    public int getAttackPower() {
        return 20;
    }

}
