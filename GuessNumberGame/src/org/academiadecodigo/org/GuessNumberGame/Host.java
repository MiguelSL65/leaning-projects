package org.academiadecodigo.org.GuessNumberGame;

public class Host {

    private int limit;
    private Player[] players;

    public Host(int limit, Player[] players) {
        this.limit = limit;
        this.players = players;
    }

    public void start() {
        int systemGuess = chooseNumber();
        System.out.println("System number is " + systemGuess);

        boolean endGame = false;

        while (!endGame) {

            for(Player player : players) {
                int playerGuess = player.chooseNumber(limit);
                System.out.println(player.getName() + "picks number " + playerGuess);

                if (playerGuess == systemGuess) {
                    System.out.println("Player " + player + " got that right!");
                    break;
                }
            }
        }
    }

    private int chooseNumber() {
        return Random.getRandom(limit);
    }
}
