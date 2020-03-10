package org.academiadecodigo.rhashtafaris;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class fileanalyzer {

    public void countWords() {

    }

    public static void main(String[] args) {

        String filePath = "/Users/codecadet/codecadet/miguel-lemos/FileAnalyzer/resources/test.txt";
        File file = new File(filePath);

        try {

            Stream<String> myStream = Files.lines(file.toPath());
            myStream.mapToInt(word -> word.length())
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
