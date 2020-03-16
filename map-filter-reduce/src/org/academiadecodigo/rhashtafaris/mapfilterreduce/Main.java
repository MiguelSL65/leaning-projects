package org.academiadecodigo.rhashtafaris.mapfilterreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle. ";

        String[] myCaps = message.split(" ");

        System.out.println(Stream.of(myCaps)
                .map(word -> word.toUpperCase())
                .filter(word -> !word.equalsIgnoreCase("garbage"))
                .reduce("", (string, string2) -> string + " " +string2));

    }
}
