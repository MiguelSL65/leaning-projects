package org.academiadecodigo.rhashtafaris.histogram;

public class Main {

    private static final String TEXT = "hello hello goodbye test testing app app fds fds crlh p crlh";

    public static void main(String[] args) {

        WordHistogramInher hashMap = new WordHistogramInher();
        hashMap.insert(TEXT);

        System.out.println("The map has " + hashMap.size() + " distinct words.\n");

        for (String str : hashMap) {
            System.out.println(str + ": " + hashMap.get(str));
        }
    }
}
