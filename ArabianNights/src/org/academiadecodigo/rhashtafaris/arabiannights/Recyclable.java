package org.academiadecodigo.rhashtafaris.arabiannights;

public class Recyclable extends Genie {

    private boolean recycled;

    public Recyclable (int maxWishes) {

        super(maxWishes);
    }

    @Override
    public boolean canGrantWish() {

        return recycled = true;
    }

    public boolean isRecycled() {
        return recycled;
    }

    public void recycle() {
        recycled = true;
    }
}
