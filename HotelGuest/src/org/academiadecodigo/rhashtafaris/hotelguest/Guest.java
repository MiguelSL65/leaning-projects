package org.academiadecodigo.rhashtafaris.hotelguest;

public class Guest {

    private String name;
    private Hotel hotel;
    private int roomNumber;
    private boolean isCheckIn;

    public Guest (String name) {
        this.name = name;
        this.roomNumber = 0;
        this.isCheckIn = false;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public String getName() {
        return name;
    }

    public boolean getIsCheckIn() {
        return isCheckIn;
    }

    public void checkIn(Hotel hotel) {

    }

    public void checkOut() {

    }
}
