package org.academiadecodigo.rhashtafaris.hotelguest;

public class Hotel {

    private String hotelName;
    private Room[] room;

    public Hotel (String hotelName, int addThisRooms) {
        this.hotelName = hotelName;
        this.room = new Room[addThisRooms];
    }



    public void roomVerify() {

    }

}
