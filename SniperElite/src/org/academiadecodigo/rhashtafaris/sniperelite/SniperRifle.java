package org.academiadecodigo.rhashtafaris.sniperelite;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.Enemy;

public class SniperRifle {

    private int bulletDamage;
    private int shotsFired;

    public int getShotsFired() {
        return shotsFired;
    }

    public SniperRifle() {
        this.bulletDamage = 25;
        this.shotsFired = 0;
    }

    public void shoot (Enemy enemy) {
        while (!enemy.isDead()) {
            enemy.hit(bulletDamage);
            shotsFired++;
            System.out.println("Number of shots fired to kill enemy: " + getShotsFired());
        }
    }
}
