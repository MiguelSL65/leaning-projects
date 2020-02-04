package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

public class Enemy extends GameObject {

    private int health;
    private boolean isDead;

    public Enemy() {
        this.health = 100;
        this.isDead = false;
    }

    @Override
    public String getMessage() {
        return null;
    }

    public boolean isDead() {
        if (health <= 0) {
            isDead = true;
        }
        return isDead;
    }

    public void hit(int bulletDamage) {
        health -= bulletDamage;
        System.out.println("Enemy health is: " + health);
        if (health <= 0) {
            System.out.println("You're dead motherFUCKER!");
        }
    }
}
