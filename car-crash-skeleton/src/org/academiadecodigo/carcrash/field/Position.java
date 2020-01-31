package org.academiadecodigo.carcrash.field;

public class Position {

    private int col;
    private int row;

    public int getCol() {

        return this.col = (int) (Math.floor(Math.random() * 101));
    }

    public int getRow() {

        return this.row = (int) (Math.floor(Math.random() * 26));
    }
}
