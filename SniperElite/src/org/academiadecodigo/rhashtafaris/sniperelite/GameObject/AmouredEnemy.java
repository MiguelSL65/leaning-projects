package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

public class AmouredEnemy extends Enemy {

    private int armour;

    public AmouredEnemy() {
        this.armour = 100;
    }

    @Override
    public void hit(int bulletDamage) {

        while (armour > 0) {
            armour -= bulletDamage;
            System.out.println("Armour health is " + armour);
        }
        super.hit(bulletDamage);
    }

    @Override
    public String getMessage() {
        return "-----------------I'm an Armoured Enemy. My total health is 200!--------------" + "\n";
    }
}
