package org.academiadecodigo.rhashtafaris.mapeditor;

/*
    1. draw canvas - DONE
    2. create grid/cells/squares - DONE
    3. create cursor - DONE
    4. create input handler - DONE
    5. move cursor - DONE
    6. paint - DONE
    7. toggle cell - DONE
    8. save to file - DONE
    9. load from file - DONE
    10. quit
 */

public class Main {

    public static void main(String[] args) {
        new Grid().init(30, "resources/grid");
    }
}
