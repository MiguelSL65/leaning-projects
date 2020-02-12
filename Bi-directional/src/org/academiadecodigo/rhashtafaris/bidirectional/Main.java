package org.academiadecodigo.rhashtafaris.bidirectional;

public class Main {

    public static void main(String[] args) {

        // Choose a positive integer to iterate from min to max. A negative integer will iterate from max to min.
        Range range = new Range (0, 10, -1);

        for (Integer i : range) {
            System.out.println(i);
        }
    }
}
