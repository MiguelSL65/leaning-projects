package org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.GameObject;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;

    public Barrel(BarrelType barrelType) {
        this.currentDamage = 0;
        this.barrelType = barrelType;
        this.destroyed = false;
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;

    }

    public void destroy() {
        destroyed = true;
    }

    @Override
    public String getMessage() {
        return "--------------- BARREL. 80 HEALTH POINTS -------------------" + "\n";
    }

    @Override
    public void hit(int bulletDamage) {

        currentDamage += bulletDamage;
        System.out.println("Barrel damage is: " + currentDamage + ".");

        if (currentDamage >= barrelType.getMaxDamage()) {
            destroy();
            System.out.println("BOOOOOOOM ####### BOOOOM");
        }
    }
}
