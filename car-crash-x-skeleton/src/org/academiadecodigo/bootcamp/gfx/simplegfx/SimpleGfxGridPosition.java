package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid grid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {

        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        this.grid = grid;

        rectangle = new Rectangle(grid.columnToX(super.getCol()), grid.rowToY(super.getRow()),
                grid.getCellSize(), grid.getCellSize());
        show();
    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {

        super(col, row, grid);

        this.grid = grid;

        rectangle = new Rectangle(grid.columnToX(super.getCol()), grid.rowToY(super.getRow()),
                grid.getCellSize(), grid.getCellSize());
        show();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int initialRow = super.getRow();
        int initialCol = super.getCol();
        // hide();

        super.moveInDirection(direction, distance);
        //  show();

        int finalRow = super.getRow();
        int finalCol = super.getCol();

        int distRow = finalRow - initialRow;
        int distCol = finalCol - initialCol;

        rectangle.translate(distCol * grid.getCellSize(), distRow * grid.getCellSize());

    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        super.setColor(color);
    }
}
