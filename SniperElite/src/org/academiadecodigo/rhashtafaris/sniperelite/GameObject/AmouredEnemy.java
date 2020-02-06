package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

public class AmouredEnemy extends Enemy {

    private int armour;

    public AmouredEnemy() {
        this.armour = 150;
    }

    @Override
    public void hit(int bulletDamage) {

        int damage = bulletDamage;

        if (armour < bulletDamage) {
            damage = bulletDamage - armour;
            armour = 0;
        }

        super.hit(damage);

    }

    @Override
    public String getMessage() {
        return "-----------------I'm an Armoured Enemy. 200 HEALTH POINTS!--------------" + "\n";
    }
}
