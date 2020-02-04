package org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.GameObject;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean isDestroyed;

    public Barrel() {
        this.currentDamage = 0;
        this.isDestroyed = false;
    }

    @Override
    public boolean isDestroyed() {

        if (currentDamage < 80) {
            return isDestroyed = false;
        } else {
            return isDestroyed = true;
        }
    }

    @Override
    public String getMessage() {
        return "--------------- BARREL READY TO BE SHOT. -------------------" + "\n";
    }

    @Override
    public void hit(int bulletDamage) {

        currentDamage += bulletDamage;
        System.out.println("Barrel damage is: " + currentDamage + ".");

        if (currentDamage >= 80) {
            System.out.println("BOOOOOOOM ####### BOOOOM");
        }
    }
}
