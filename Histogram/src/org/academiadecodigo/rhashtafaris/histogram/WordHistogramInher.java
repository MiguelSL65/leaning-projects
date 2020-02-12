package org.academiadecodigo.rhashtafaris.histogram;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramInher extends HashMap<String, Integer> implements Iterable <String> {

    public void insert(String text) {

        for (String word : text.split(" ")) {

            if (!containsKey(word)) {
                put(word, 1);
                continue;
            }

            put(word, get(word) + 1);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return keySet().iterator();
    }
}
