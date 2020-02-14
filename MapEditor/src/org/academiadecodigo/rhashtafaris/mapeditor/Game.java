package org.academiadecodigo.rhashtafaris.mapeditor;

public class Game {

    private MapGrid grid;
    private Cursor cursor;
    private MapGridPosition pos;

    public Game(int cols, int rows) {
        this.grid = new MapGrid(cols, rows);
        this.pos = new MapGridPosition(cols, rows, grid);
    }

    public void init() {
        this.grid.init();
        this.cursor = new Cursor(this.grid.makeCursorPosition(0, 0));
        this.cursor.setGrid(this.grid);
    }
}
