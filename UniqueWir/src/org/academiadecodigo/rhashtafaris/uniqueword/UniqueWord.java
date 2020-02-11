package org.academiadecodigo.rhashtafaris.uniqueword;

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

        for (String word : text) {
            hashSet.add(word);
        }

        System.out.println(this.hashSet);
    }


    public Iterator<String> iterator() {
       return hashSet.iterator();
    }
}
