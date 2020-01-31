package org.academiadecodigo.rhashtafaris.arabiannights;

public class Main {

    public static void main(String[] args) {

        MagicLamp myWishLamp = new MagicLamp(3);

        Genie myNewGenie[] = new Genie[5];

        for (int i = 0; i  < myNewGenie.length; i++) {
            myNewGenie[i] = myWishLamp.rub(5);
        }

    }
}
