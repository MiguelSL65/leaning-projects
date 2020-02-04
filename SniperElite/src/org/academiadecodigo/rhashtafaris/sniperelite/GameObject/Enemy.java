package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

import org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel.Destroyable;

public class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean isDestroyed;

    public Enemy() {
        this.health = 100;
        this.isDestroyed = false;
    }

    @Override
    public String getMessage() {
        return null;
    }

    public boolean isDestroyed() {

        if (health <= 0) {
            isDestroyed = true;
        }
        return isDestroyed;
    }

    public void hit(int bulletDamage) {

        health -= bulletDamage;
        System.out.println("Enemy health is: " + health);
    }
}
