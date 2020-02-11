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
    }

    public void slash() {
    }

    public void setGrid(SimpleGfxGrid grid) {
        this.grid = grid;
    }

    private class KatanaController implements MouseHandler {
        private Mouse mouse = new Mouse(this);

        KatanaController() {
            this.initMouse();
        }

        void initMouse() {
            this.mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        }

        public void mouseClicked(MouseEvent event) {
            Katana.this.x = (int)event.getX();
            Katana.this.y = (int)event.getY();
            Katana.this.slash();
        }

        public void mouseMoved(MouseEvent event) {
        }
    }

}
