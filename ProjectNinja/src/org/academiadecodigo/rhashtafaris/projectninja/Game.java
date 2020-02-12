package org.academiadecodigo.rhashtafaris.projectninja;

import static org.academiadecodigo.rhashtafaris.projectninja.BallFactory.createBall;

public class Game {

    private int time = 0;
    private int points = 0;
    private int delay;
    private Ninja ninja;
    private Level level;
    private SimpleGfxGrid grid;
    private Katana katana;
    private LinkedList<Balls> ballsLinkedList;

    public Game(int cols, int rows, int delay) {
        this.delay = delay;
        this.grid = new SimpleGfxGrid(cols, rows);
        ballsLinkedList = new LinkedList<>();
    }

    public void init() {
        this.grid.init();
        this.ninja = new Ninja(this.grid.makeNinjaGridPosition(325, 700));
        this.ninja.setGrid(this.grid);
        ninja.initMouse();
        this.katana = new Katana();
        this.katana.setGrid(this.grid);
    }

    public void start() throws InterruptedException {
        boolean gameEnd = false;
        double timer = 10;

        while (!gameEnd) {

            Thread.sleep(delay);

            if (timer == 0) {
                ballsLinkedList.add(BallFactory.createBall(grid));
                timer = 10;
            }

            timer--;

            ballGravity();
        }
    }

    public void ballGravity() {

        for (Balls ball : ballsLinkedList) {
            ball.gravity();
        }
    }
}
