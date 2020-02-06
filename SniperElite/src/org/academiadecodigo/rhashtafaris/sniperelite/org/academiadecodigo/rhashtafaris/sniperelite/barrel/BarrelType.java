package org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel;

public enum BarrelType {
    PLASTIC(40),
    WOOD(65),
    METAL(90);

    private int maxDamage;

    BarrelType (int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public static BarrelType getRandom() {
        int random = (int) (Math.random() * BarrelType.values().length);
        BarrelType barrelType = BarrelType.values()[random];
        return barrelType;
    }
}
