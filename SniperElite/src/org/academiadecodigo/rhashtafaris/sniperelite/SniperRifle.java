package org.academiadecodigo.rhashtafaris.sniperelite;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.Enemy;

public class SniperRifle {

    private int bulletDamage;
    private int shotsFired;
    private int totalShotsFired;

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

    public void shoot (Enemy enemy) {

        while (!enemy.isDead()) {
            shotsFired++;
            totalShotsFired++;

            System.out.println("Number of shots fired to kill enemy: " + getShotsFired() + "." + "\n" + "Total shots fired so far: " + getTotalShotsFired());

            enemy.hit(bulletDamage);

            if (enemy.isDead()) {
                shotsFired = 0;
            }
        }
    }
}
