package org.academiadecodigo.rhashtafaris.arabiannights;

public class Genie {

    private int maxWishes;
    private int wishesGranted;

    public Genie (int maxWishes) {
        this.maxWishes = maxWishes;
        this.wishesGranted = 0;
    }

    public int getWishesGranted() {
        return wishesGranted;
    }

    public void wishesGrantedCounter() {
        wishesGranted++;
    }

    public boolean canGrantWish() {
        return wishesGranted < maxWishes;
    }

    public boolean grantWish() {
        if (canGrantWish()) {
            wishesGrantedCounter();
            return true;
        }
            return false;
    }
}
