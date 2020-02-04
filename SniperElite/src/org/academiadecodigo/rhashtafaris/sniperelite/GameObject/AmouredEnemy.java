package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

public class AmouredEnemy extends Enemy {

    private int armour;

    public AmouredEnemy() {
        this.armour = 150;
    }

    @Override
    public void hit(int bulletDamage) {

        if (armour > 0) {
            armour -= bulletDamage;
            System.out.println("Armour health is " + armour);
        } else {
            if (armour == 0) {
                super.hit(bulletDamage);
            }
        }
    }

    @Override
    public String getMessage() {
        return "-----------------I'm an Armoured Enemy. My total health is 200!--------------" + "\n";
    }
}
