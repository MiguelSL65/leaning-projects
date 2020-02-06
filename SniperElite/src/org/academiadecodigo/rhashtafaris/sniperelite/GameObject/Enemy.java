package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

import org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel.Destroyable;

public class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean destroyed;

    public Enemy() {
        this.health = 100;
        this.destroyed = false;
    }

    @Override
    public String getMessage() {
        return null;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void destroy() {
        destroyed = true;
    }

    public void hit(int bulletDamage) {

        if (bulletDamage > health) {
            health = 0;
            destroy();
        }

        health -= bulletDamage;
        System.out.println("Enemy health is: " + health);
    }
}
