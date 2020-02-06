package org.academiadecodigo.rhashtafaris.simplegfxdemo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 10, 800, 800);

        rectangle.setColor(Color.ORANGE);
        rectangle.fill();

        StonedJesus jesus = new StonedJesus();
        jesus.init();

        Blunt essa = new Blunt();
        essa.inicializa();
    }
}
