package org.academiadecodigo.Bootcamp40.rockpaperscissors;

public class Player {

    private String name;
    private int victories = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getVictories() {
        return victories;
    }

    public String getName() {
        return name;
    }

    public void win() {
        victories++;
    }

    public Handtypes chooseHand () {
        int r = (int) (Math.random() * Handtypes.values().length);
        return Handtypes.values()[r];
    }

}
