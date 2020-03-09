package org.academiadecodigo.rhashtafaris.wordreader;

import java.io.*;
import java.util.*;

public class WordReader implements Iterable<String> {

    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private String str;
    private LinkedList<String> wordList;

    public WordReader() {
        this.wordList = new LinkedList<>();
    }

    public void reader(String location) throws IOException {

        this.str = location;

        fileReader = new FileReader(location);
        bufferedReader = new BufferedReader(fileReader);

        String result = bufferedReader.readLine();

        while (result != null) {

            String[] fuck = result.split(" ");

            Collections.addAll(wordList, fuck);

            result = bufferedReader.readLine();
        }

        bufferedReader.close();
    }

    @Override
    public Iterator<String> iterator() {
        return wordList.iterator();
    }
}
