package org.academiadecodigo.rhashtafaris.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MapGrid {

    private Rectangle canvas;
    private int cols;
    private int rows;
    private int cellSize;

    public MapGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.cellSize = 2;
        this.canvas = new Rectangle(0, 0, (double)cols * this.cellSize, (double)rows * this.cellSize);
    }

    public void init() {
        this.canvas.setColor(Color.WHITE);
        this.canvas.fill();
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getWidth() {
        return canvas.getWidth();
    }

    public int getHeight() {
        return canvas.getHeight();
    }

    public int getX() {
        return this.canvas.getX();
    }

    public int getY() {
        return this.canvas.getY();
    }

    public int getCellSize() {
        return this.cellSize;
    }

    public int rowToY(int row) {
        return row * this.cellSize;
    }

    public int rowToX(int col) {
        return col * this.cellSize;
    }

    public MapGridPosition makeRectangles(int col, int row) {
        return new MapGridPosition(col, row, this);
    }

    public MapGridPosition makeCursorPosition(int col, int row) {
        return new MapGridPosition(col, row, this);
    }
}
