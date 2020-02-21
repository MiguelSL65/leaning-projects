package org.academiadecodigo.rhashtafaris.mapeditor.input.simple;

import org.academiadecodigo.rhashtafaris.mapeditor.FileHandler;
import org.academiadecodigo.rhashtafaris.mapeditor.Grid;
import org.academiadecodigo.rhashtafaris.mapeditor.cell.Cursor;
import org.academiadecodigo.rhashtafaris.mapeditor.input.Action;
import org.academiadecodigo.rhashtafaris.mapeditor.input.InputHandler;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.util.HashMap;
import java.util.Map;

public class SimpleInputHandler implements InputHandler, KeyboardHandler {

    private Map<Integer, Action> actions = new HashMap<>();

    @Override
    public void init(Grid grid, FileHandler fileHandler) {
        mapKeys(grid, fileHandler);

        Keyboard keyboard = new Keyboard(this);

        for (Integer key : actions.keySet()) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKey(key);
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(event);
        }
    }

    private void mapKeys(Grid grid, org.academiadecodigo.rhashtafaris.mapeditor.FileHandler fileHandler) {
        actions.put(KeyboardEvent.KEY_UP, new Action() {
            @Override
            public void execute() {
                grid.moveCursor(Cursor.Direction.UP);
            }
        });

        actions.put(KeyboardEvent.KEY_DOWN, new Action() {
            @Override
            public void execute() {
                grid.moveCursor(Cursor.Direction.DOWN);
            }
        });

        actions.put(KeyboardEvent.KEY_LEFT, new Action() {
            @Override
            public void execute() {
                grid.moveCursor(Cursor.Direction.LEFT);
            }
        });

        actions.put(KeyboardEvent.KEY_RIGHT, new Action() {
            @Override
            public void execute() {
                grid.moveCursor(Cursor.Direction.RIGHT);
            }
        });

        actions.put(KeyboardEvent.KEY_SPACE, new Action() {
            @Override
            public void execute() {
                grid.paint();
            }
        });

        actions.put(KeyboardEvent.KEY_S, new Action() {
            @Override
            public void execute() {
                fileHandler.save(grid.toString());
            }
        });

        actions.put(KeyboardEvent.KEY_L, new Action() {
            @Override
            public void execute() {
                grid.fromString(fileHandler.read());
            }
        });

        actions.put(KeyboardEvent.KEY_Q, new Action() {
            @Override
            public void execute() {
                System.exit(0);
            }
        });
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Action action = actions.get(keyboardEvent.getKey());
        action.execute();
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        //no KEY_RELEASED events necessary.
    }
}
