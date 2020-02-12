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
    private SimpleGfxPosition pos;
    private Picture katana;
    private KatanaController controller;

    public Katana() {
       // this.katana = new Picture((double)pos.getCol(), (double)pos.getRow(), "Ninja/katana.png");
        new KatanaController();
    }

    public SimpleGfxPosition getPos() {
        return this.pos;
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

    public class KatanaController implements MouseHandler {

        private Mouse mouse;

        KatanaController() {
            this.mouse = new Mouse(this);
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
        public void mouseMoved(MouseEvent var1) {
            pos.katanaPosition(var1.getX(), var1.getY());


        }
    }
}
