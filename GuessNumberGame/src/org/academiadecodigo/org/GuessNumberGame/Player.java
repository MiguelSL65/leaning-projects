package org.academiadecodigo.org.GuessNumberGame;

public class Player {

    private String name;

    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int chooseNumber (int limit) {
        return Random.getRandom(limit);
    }
}
