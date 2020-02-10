package org.academiadecodigo.rhashtafaris.iterableinteger.org.academiadecodigo.rhashtafaris.iterableinteger.iterator;

import java.util.Iterator;

public class Range implements Iterable <Integer> {

    private RangeIterator rangeIterator;

    public Range(int min, int max) {
        this.rangeIterator = new RangeIterator(min, max);
    }

    @Override
    public Iterator <Integer> iterator() {

        return rangeIterator;
    }
}
