package org.academiadecodigo.bootcamp.grid;

/**
 * The directions in which positions may move
 */
public enum GridDirection {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    /**
     * Detects if two directions are opposite
     *
     * @param dir the direction to compare with
     * @return true if directions are opposite
     */
    public boolean isOpposite(GridDirection dir) {
        return dir.equals(oppositeDirection());
    }

    /**
     * Obtains the opposite direction
     *
     * @return the opposite direction
     */
    public GridDirection oppositeDirection() {

        GridDirection opposite = null;

        switch (this) {
            case UP:
                opposite = DOWN;
                break;
            case DOWN:
                opposite = UP;
                break;
            case LEFT:
                opposite = RIGHT;
                break;
            case RIGHT:
                opposite = LEFT;
                break;
        }

        return opposite;
    }

}
