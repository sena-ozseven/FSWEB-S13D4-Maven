package org.example;

public enum Weapon {

    SWORD(33, 3.3),
    AXE(40, 2.0),
    BOW(10, 4.0);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return this.damage;
    }
    public double getAttackSpeed() {
        return this.attackSpeed;
    }

}
