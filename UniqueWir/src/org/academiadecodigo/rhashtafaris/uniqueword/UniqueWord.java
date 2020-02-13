package org.academiadecodigo.rhashtafaris.uniqueword;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable<String> {

    private HashSet hashSet;
    private String[] text;

    public UniqueWord(String text) {
        this.text = text.split(" ");
        this.hashSet = new HashSet();
    }

    public void add() {

        Collections.addAll(hashSet, text);

    }

    @Override
    public Iterator<String> iterator() {
       return hashSet.iterator();
    }
}
