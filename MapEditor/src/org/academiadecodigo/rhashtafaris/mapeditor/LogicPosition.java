package org.academiadecodigo.rhashtafaris.mapeditor;

public class LogicPosition {

    private int col;
    private int row;
    private MapGrid grid;

    public LogicPosition(int col, int row, MapGrid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    public MapGrid getGrid() {
        return this.grid;
    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

}
