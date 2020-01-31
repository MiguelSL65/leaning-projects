package org.academiadecodigo.Bootcamp40.rockpaperscissors;

public class Game {

    private int maxRounds;
    private int rounds;

    private Player playerOne;
    private Player playerTwo;

    public Game (int maxRounds, Player playerOne, Player playerTwo) {
        this.maxRounds = maxRounds;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.rounds = 0;
    }

    public void start() {

        while (rounds < maxRounds) {
            playRound();
        }

        if (playerOne.getVictories() == playerTwo.getVictories()) {
            System.out.println("tie");
            playRound();
        }

        displayResults();
    }

    private void playRound() {

        int roundNumber = rounds + 1;
        System.out.println("Round " + roundNumber);


        Handtypes p1Hand = playerOne.chooseHand();
        Handtypes p2Hand = playerTwo.chooseHand();

        System.out.println(playerOne.getName() + );
        System.out.println();

        if (p1Hand == p2Hand) {
            System.out.println();
            playRound();
            return;
        }

        rounds++;

        Player winner = playerOne;

        switch (p1Hand) {
            case PAPER:
        }

        System.out.println(winner.getName() + "wins this one");
    }

    private void displayResults() {
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
