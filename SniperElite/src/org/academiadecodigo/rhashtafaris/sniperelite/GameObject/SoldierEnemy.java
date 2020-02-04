package org.academiadecodigo.rhashtafaris.sniperelite.GameObject;

public class SoldierEnemy extends Enemy {

    @Override
    public void hit(int bulletDamage) {
        super.hit(bulletDamage);
    }

    @Override
    public String getMessage() {
        return "I'm a soldier enemy. My health is 100";
    }
}
