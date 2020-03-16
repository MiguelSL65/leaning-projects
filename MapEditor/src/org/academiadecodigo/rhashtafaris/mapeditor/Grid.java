package org.academiadecodigo.rhashtafaris.mapeditor;

import org.academiadecodigo.rhashtafaris.mapeditor.cell.Cell;
import org.academiadecodigo.rhashtafaris.mapeditor.cell.Cursor;
import org.academiadecodigo.rhashtafaris.mapeditor.graphic.simple.SimpleColor;
import org.academiadecodigo.rhashtafaris.mapeditor.graphic.simple.SimpleGraphic;
import org.academiadecodigo.rhashtafaris.mapeditor.input.simple.SimpleInputHandler;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Cell> cells = new ArrayList<>();
    private Cursor cursor;

    public void init(int size, String file) {
        new SimpleGraphic(size).show();
        createCells(size);

        cursor = new Cursor();
        cursor.setGraphic(new SimpleGraphic(SimpleColor.RED));
        cursor.show();

        new SimpleInputHandler().init(this, new FileHandler(file));
    }

    private void createCells(int size) {
        int amount = (int) Math.pow(size, 2); // size ^2.

        for (int i = 0; i < amount; i++) {
            int column = i / size;
            int row = i % size;
            Cell cell = new Cell(column, row);
            cell.setGraphic(new SimpleGraphic(SimpleGraphic.toPixel(column), SimpleGraphic.toPixel(row)));
            cells.add(cell);
            cell.show();
        }
    }

    public void moveCursor(Cursor.Direction direction) {
        if (!canMove(direction)) {
            return;
        }

        cursor.move(direction);
    }

    public void paint() {
        for (Cell cell : cells) {
            if(cell.equals(cursor)) {
                cell.toggle();
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Cell cell : cells) {
            builder.append(cell.isPainted() ? Cell.PAINTED : Cell.EMPTY);
        }

        return builder.toString();
    }

    private boolean canMove(Cursor.Direction direction) {
        int sideSize = (int) Math.sqrt(cells.size());

        switch (direction) {
            case UP:
                return cursor.getRow() > 0;
            case DOWN:
                return cursor.getRow() < sideSize -1;
            case LEFT:
                return cursor.getColumn() > 0;
            case RIGHT:
                return cursor.getColumn() < sideSize - 1;
        }

        throw new IllegalArgumentException("Grid#canMove(Cursor.Direction");
    }

    public void fromString(String text) {
        String[] cells = text.split("");

        for (int i = 0; i < this.cells.size(); i++) {
            Cell cell = this.cells.get(i);

            if (cells[i].equals(Cell.EMPTY)) {
                cell.clear();
                continue;
            }

            cell.paint();
        }
    }
}
