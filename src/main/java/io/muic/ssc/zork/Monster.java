package io.muic.ssc.zork;

public class Monster {
    private int maxHP;
    private int curHP;
    private int attackPower;
    private boolean alive;

    public Monster() {
        this.maxHP = 100;
        this.curHP = this.maxHP;
        this.attackPower = 20;
        this.alive = true;
    }

    private void takeDamage(int damage) {
        this.curHP -= damage;
        if (this.curHP <= 0) {
            setDead();
        }
    }
    private void setDead() {
        this.alive = false;
    }

    public int getCurHP() {
        return this.curHP;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

}
