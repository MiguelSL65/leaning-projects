package org.academiadecodigo.rhashtafaris.hotelguest;

public class Room {

    private int roomNumber;
    private boolean isFree;

    public Room (int roomNumber) {
        this.roomNumber = roomNumber;
        this.isFree = true;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }




}
