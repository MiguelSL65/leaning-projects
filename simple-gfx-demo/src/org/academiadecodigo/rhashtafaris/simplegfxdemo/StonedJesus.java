package org.academiadecodigo.rhashtafaris.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StonedJesus {

    private Picture picture;

    public StonedJesus() {
        picture = new Picture(550,450, "jesus.png");
    }

    public void init() {
        picture.draw();
    }
}
