package org.academiadecodigo.rhashtafaris.projectninja;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Katana {

    private int x;
    private int y;
    private Balls ball;
    private SimpleGfxGrid grid;
    private Picture katana;

    public Katana() {
        new KatanaController();

    }

    public void slash() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setGrid(SimpleGfxGrid grid) {
        this.grid = grid;
    }

    private class KatanaController implements MouseHandler {

        private Mouse mouse = new Mouse(this);

        KatanaController() {
            initMouse();
        }

        void initMouse() {
            this.mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        }

        @Override
        public void mouseClicked(MouseEvent event) {
            x = (int)event.getX();
            y = (int)event.getY();
            slash();
            System.out.println(event);
        }

        @Override
        public void mouseMoved(MouseEvent event) {
            System.out.println(event);
        }
    }
}
