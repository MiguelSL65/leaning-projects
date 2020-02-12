package org.academiadecodigo.rhashtafaris.bidirectional;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    private int min;
    private int max;
    private int iterator;

    public Range(int min, int max, int iterator) {
        this.min = min;
        this.max = max;
        this.iterator = iterator;
    }

    @Override
    public Iterator<Integer> iterator() {

        if (iterator >= 0) {

            return new Iterator<>() {

                @Override
                public boolean hasNext() {
                    return min <= max;
                }

                @Override
                public Integer next() {
                    return min++;
                }

            };
        }
        if (iterator <= 0) {

            return new Iterator<>() {

                @Override
                public boolean hasNext() {
                    return max >= min;
            }

            @Override
            public Integer next() {
                return max--;
            }
        };
        }
        return null;
    }
}
