package org.academiadecodigo.rhashtafaris.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Cursor {

    private MapGrid grid;
    private MapGridPosition pos;
    private Rectangle cursor;

    public Cursor(MapGridPosition pos) {
        this.cursor = new Rectangle((double)pos.getCol(), (double)pos.getRow(), (double) 20, (double) 20);
        this.pos = pos;
        new KeyboardInit();
        init();
    }

    public void init() {
        this.cursor.setColor(Color.CYAN);
        this.cursor.draw();
    }

    public void setGrid(MapGrid grid) {
        this.grid = grid;
    }

    public class KeyboardInit implements KeyboardHandler {

        private Keyboard keyboard;

        KeyboardInit() {
            this.keyboard = new Keyboard(this);
            initKeyboard();
        }

        private void initKeyboard() {
            KeyboardEvent rightPressed = new KeyboardEvent();
            rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
            rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent leftPressed = new KeyboardEvent();
            leftPressed.setKey(KeyboardEvent.KEY_LEFT);
            leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent downPressed = new KeyboardEvent();
            downPressed.setKey(KeyboardEvent.KEY_DOWN);
            downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent upPressed = new KeyboardEvent();
            upPressed.setKey(KeyboardEvent.KEY_UP);
            upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent colorPressed = new KeyboardEvent();
            colorPressed.setKey(KeyboardEvent.KEY_SPACE);
            colorPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            keyboard.addEventListener(rightPressed);
            keyboard.addEventListener(leftPressed);
            keyboard.addEventListener(downPressed);
            keyboard.addEventListener(upPressed);
            keyboard.addEventListener(colorPressed);
        }

        @Override
        public void keyPressed(KeyboardEvent event) {
            switch (event.getKey()) {
                case KeyboardEvent.KEY_RIGHT:
                    if(cursor.getX() == 680) {
                        break;
                    }
                    cursor.translate(20, 0);
                    break;
                case KeyboardEvent.KEY_LEFT:
                    if(cursor.getX() == 0){
                        break;
                    }
                    cursor.translate(-20, 0);
                    break;
                case KeyboardEvent.KEY_DOWN:
                    if(cursor.getY() == 680) {
                        break;
                    }
                    cursor.translate(0, 20);
                    break;
                case KeyboardEvent.KEY_UP:
                    if(cursor.getY() == 0) {
                        break;
                    }
                    cursor.translate(0, -20);
                    break;
                case KeyboardEvent.KEY_SPACE:
                    cursor.setColor(Color.BLUE);
                    cursor.draw();
                    break;
                default:
                    cursor.translate(20, 0);
                    break;
            }
        }

        @Override
        public void keyReleased(KeyboardEvent event) {

        }
    }

}
