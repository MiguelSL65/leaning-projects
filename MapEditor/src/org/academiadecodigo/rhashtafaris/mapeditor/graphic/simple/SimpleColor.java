package org.academiadecodigo.rhashtafaris.mapeditor.graphic.simple;

import org.academiadecodigo.simplegraphics.graphics.Color;

public enum SimpleColor {
    RED(Color.RED);

    private Color color;

    SimpleColor(Color color) {
        this.color = color;
    }

    public Color get() {
        return color;
    }
}
