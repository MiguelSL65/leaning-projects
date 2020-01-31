package org.academiadecodigo.rhashtafaris.arabiannights;

public class Grumpy extends Genie{

    private static final int MAX_WISHES_CAN_GRANTED = 1;

    public Grumpy (int maxWishes) {

        super(maxWishes);
    }

    @Override
    public boolean canGrantWish() {


        return (getWishesGranted() < MAX_WISHES_CAN_GRANTED);


    }
}
