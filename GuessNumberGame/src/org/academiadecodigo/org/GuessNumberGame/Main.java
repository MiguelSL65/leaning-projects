package org.academiadecodigo.org.GuessNumberGame;

public class Main {
    public static void main(String[] args) {

        Player[] players = {
                new Player("ferdiNAND"),
                new Player("Sara"),
                new Player("Seringas"),
                new Player("Filipe"),
                new Player("Mary")
        }

        Host game = new Host(10, Player[] players);


    }
}
