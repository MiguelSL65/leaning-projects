package org.academiadecodigo.rhashtafaris.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MapGridPosition extends LogicPosition {

    private Rectangle rectangle;
    private MapGrid grid;

    public MapGridPosition(int col, int row, MapGrid grid) {
        super(col, row, grid);
        this.grid = grid;
        this.rectangle = new Rectangle((double)this.getCol(), (double)this.getRow(), (double)10 * grid.getCellSize(), (double)10 * grid.getCellSize());
        this.rectangleShow();
        initGrid();
    }

    public void initGrid() {
                this.rectangle = new Rectangle(0, 0, 10 * grid.getCellSize(), 10 * grid.getCellSize());
        rectangleShow();
    }

    public void rectangleShow() {
        this.rectangle.setColor(Color.BLACK);
        this.rectangle.draw();
    }
}
