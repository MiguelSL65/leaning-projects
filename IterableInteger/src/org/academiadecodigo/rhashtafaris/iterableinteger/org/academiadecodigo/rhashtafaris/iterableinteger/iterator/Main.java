package org.academiadecodigo.rhashtafaris.iterableinteger.org.academiadecodigo.rhashtafaris.iterableinteger.iterator;

public class Main {

    public static void main(String[] args) {

        Range range = new Range (0, 10);
        // RangeIterator it = new RangeIterator(0, 10);


        for (Integer r : range) {
            System.out.println(r);
        }
    }
}
