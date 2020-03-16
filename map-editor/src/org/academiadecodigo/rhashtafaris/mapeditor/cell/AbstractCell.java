package org.academiadecodigo.rhashtafaris.mapeditor.cell;

import org.academiadecodigo.rhashtafaris.mapeditor.graphic.Graphic;

public abstract class AbstractCell {

    protected int column;
    protected int row;
    protected Graphic graphic;

    public AbstractCell(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public void setGraphic(Graphic graphic) {
        this.graphic = graphic;
    }

    public void show() {
        graphic.show();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AbstractCell)) {
            return false;
        }

        AbstractCell cell = (AbstractCell) object;
        return column == cell.column && row == cell.row;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
