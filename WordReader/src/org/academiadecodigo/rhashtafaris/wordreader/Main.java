package org.academiadecodigo.rhashtafaris.wordreader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

            try {
            WordReader wordReader = new WordReader();

            wordReader.reader("/Users/codecadet/Desktop/copyfile.txt");

            for (String word : wordReader) {
                System.out.println(word);
            }

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
