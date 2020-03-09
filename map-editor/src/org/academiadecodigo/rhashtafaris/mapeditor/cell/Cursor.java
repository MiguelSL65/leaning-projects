package org.academiadecodigo.rhashtafaris.mapeditor.cell;

public class Cursor extends AbstractCell {

    public Cursor() {
        super(0, 0);
    }

    @Override
    public void show() {
        graphic.paint();
    }

    public void move(Cursor.Direction direction) {
        int columnDifferential = direction.column;
        int rowDifferential = direction.row;

        column += columnDifferential;
        row += rowDifferential;

        graphic.move(columnDifferential, rowDifferential);
    }

    public enum Direction {
        UP(0, -1),
        DOWN(0, 1),
        LEFT(-1, 0),
        RIGHT(1, 0);

        private int column;
        private int row;

        Direction(int column, int row) {
            this.column = column;
            this.row = row;
        }

    }
}
