package org.academiadecodigo.rhashtafaris.mapeditor.graphic.simple;

import org.academiadecodigo.rhashtafaris.mapeditor.graphic.Graphic;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGraphic implements Graphic {

    private static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    private Rectangle rectangle;

    public SimpleGraphic(int x, int y) {
        rectangle = new Rectangle(x, y, CELL_SIZE, CELL_SIZE);
    }

    public SimpleGraphic(int sideSize) {
        rectangle = new Rectangle(PADDING, PADDING, sideSize * CELL_SIZE, sideSize * CELL_SIZE);
    }

    public SimpleGraphic(SimpleColor color) {
        rectangle = new Rectangle(PADDING, PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.setColor(color.get());
    }

    @Override
    public void show() {
        rectangle.draw();
    }

    @Override
    public void paint() {
        rectangle.fill();
    }

    @Override
    public void move(int columns, int rows) {
        rectangle.translate(columns * CELL_SIZE, rows * CELL_SIZE);
    }

    public static int toPixel(int index) {
        return PADDING + CELL_SIZE * index;
    }
}
