package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        this.healthPercentage = healthPercentage < 0 ? 0 : (healthPercentage > 100 ? 100 : healthPercentage);
    }

    public int healthRemaining() {
        return healthPercentage;
    }
    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }
    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }


}
