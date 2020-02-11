package org.academiadecodigo.rhashtafaris.projectninja;

public class Game {

    private int time = 0;
    private int points = 0;
    private int delay;
    private Ninja ninja;
    private Level level;
    private SimpleGfxGrid grid;
    //private Balls[] balls;
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
        intervalIterator = 7;
    }

    public void start() throws InterruptedException {
        boolean gameEnd = false;

        while(!gameEnd){

            Thread.sleep(delay);

            for (int i = intervalIterator; i < 0 ; i--) {



                if(i == 0){
                    ballsLinkedList.add(BallFactory.createBall(grid));
                }

            }

            ballGravity();


        }



    }

    public void ballGravity() {

        for (Balls ball : ballsLinkedList){
            ball.gravity();
        }


    }


}
