package org.academiadecodigo.rhashtafaris.histogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordHistogram implements Iterable<String> {

    private Map<String, Integer> map;

    public WordHistogram() {
        this.map = new HashMap<>();
    }

    public int size() {
        return map.size();
    }

    public int get(String word) {
        return map.get(word);
    }

    public void insert(String text) {

        for (String word : text.split(" ")) {
            map.put(word, map.containsKey(word) ? map.get(word) +1 : 1);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
