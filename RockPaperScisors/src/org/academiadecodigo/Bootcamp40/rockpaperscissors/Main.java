package org.academiadecodigo.Bootcamp40.rockpaperscissors;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(3, new Player("Filipe"), new Player("Seringas"));

        game.start();

    }
}
