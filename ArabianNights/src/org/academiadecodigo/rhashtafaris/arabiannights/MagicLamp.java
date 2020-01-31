package org.academiadecodigo.rhashtafaris.arabiannights;

public class MagicLamp {

    private int maxGenies;
    private int totalRubs;
    private int timesCharged;

    public MagicLamp (int maxGenies) {
        this.maxGenies = maxGenies;
    }

    public Genie rub (int wishes) {

        if (totalRubs >= wishes) {

            return new Recyclable(wishes);
        }

        totalRubs++;

        if (totalRubs % 2 == 0) {

            return new Friendly(wishes);
        }

        return new Grumpy(wishes);
    }

    public void recyclableDemon (Recyclable demon) {
        if (!demon.isRecycled()) {
            demon.recycle();
            totalRubs = 0;
            timesCharged++;
        }
    }
}
