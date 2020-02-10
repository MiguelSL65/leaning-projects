package org.academiadecodigo.rhashtafaris.iterableinteger.org.academiadecodigo.rhashtafaris.iterableinteger.iterator;

import java.util.Iterator;

public class RangeIterator implements Iterator <Integer> {

    private int min;
    private int max;

    RangeIterator (int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public boolean hasNext() {

        return min <= max;
    }

    @Override
    public Integer next() {

        return min++;
    }
}
