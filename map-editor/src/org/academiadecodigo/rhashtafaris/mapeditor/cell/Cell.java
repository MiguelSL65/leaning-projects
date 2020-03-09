package org.academiadecodigo.rhashtafaris.mapeditor.cell;

public class Cell extends AbstractCell {

    public static final String PAINTED = "X";
    public static final String EMPTY = "O";

    private boolean painted = false;

    public Cell(int column, int row) {
        super(column, row);
    }

    public void toggle() {
        if (painted) {
            clear();
            return;
        }

        paint();
    }

    public void paint() {
        painted = true;
        graphic.paint();
    }

    public void clear() {
        painted = false;
        graphic.show();
    }

    public boolean isPainted() {
        return painted;
    }
}
