package org.academiadecodigo.rhashtafaris.projectninja;

import static org.academiadecodigo.rhashtafaris.projectninja.BallFactory.createBall;

public class Game {

    private int time = 0;
    private int points = 0;
    private int delay;
    private Ninja ninja;
    private Level level;
    private SimpleGfxGrid grid;
    private Balls[] balls;
    private Katana katana;
    private int intervalIterator;
    private LinkedList<Balls> ballsLinkedList;

    public Game(int cols, int rows, int delay) {
        this.delay = delay;
        this.grid = new SimpleGfxGrid(cols, rows);
    }

    public void init() {
        this.grid.init();
        this.ninja = new Ninja(this.grid.makeNinjaGridPosition(325, 700));
        this.ninja.setGrid(this.grid);
        this.katana = new Katana();
        this.katana.setGrid(this.grid);
        balls = new Balls[10];
        intervalIterator = 7;
    }

    public void start() throws InterruptedException {
        boolean gameEnd = false;

        while(!gameEnd){

            Thread.sleep(delay);

            for (int i = 0; i < balls.length; i++) {

                Thread.sleep(delay);
                balls[i] = createBall(grid);
            }

            ballGravity();
        }
    }

    public void ballGravity() {

//        for (Balls ball : ballsLinkedList){
          //  ball.gravity();
        }
}
