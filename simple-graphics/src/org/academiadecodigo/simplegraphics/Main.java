package org.academiadecodigo.simplegraphics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 10, 200, 300);
        rectangle.setColor(Color.RED);
        rectangle.fill();

        Picture pic = new Picture(0, 150);
        pic.draw();
    }
}
