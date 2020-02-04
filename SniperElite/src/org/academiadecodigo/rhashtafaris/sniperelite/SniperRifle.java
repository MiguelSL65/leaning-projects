package org.academiadecodigo.rhashtafaris.sniperelite;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.Enemy;
import org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel.Destroyable;

public class SniperRifle {

    private int bulletDamage;
    private int shotsFired;
    private int totalShotsFired;
    private static final double HIT_PROB = 0.65;

    public int getShotsFired() {
        return shotsFired;
    }

    public int getTotalShotsFired() {
        return totalShotsFired;
    }

    public SniperRifle() {
        this.bulletDamage = 50;
        this.shotsFired = 0;
        this.totalShotsFired = 0;
    }

    public void shoot (Destroyable destroyable) {

        while (!destroyable.isDestroyed()) {
            shotsFired++;
            totalShotsFired++;

            System.out.println("Number of shots fired to kill enemy: " + getShotsFired() + ".");

            if (Math.random() < HIT_PROB) {
                destroyable.hit(bulletDamage);
            }

            if (destroyable.isDestroyed()) {
                shotsFired = 0;
            }
        }

        System.out.println("Total shots fired " + getTotalShotsFired() + "\n");
    }
}
