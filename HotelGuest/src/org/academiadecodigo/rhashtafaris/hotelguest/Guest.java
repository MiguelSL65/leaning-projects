package org.academiadecodigo.rhashtafaris.hotelguest;

public class Guest {

    private String name;
    private Hotel hotel;
    private int roomId = -1; // means no room ID

    public Guest (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public boolean isCheckin() {

        if (hotel == null || roomId != -1) {
            return false;
        }

        roomId = hotel.isCheckIn();

        if (roomId == -1) {
            return false;
        }

        return true;
    }

    public boolean isCheckOut() {

        if (hotel == null || roomId != -1) {
            return false;
        }

        hotel.checkOut(roomId);
        roomId = -1;
        return true;
    }

    @Override
    public String toString() {
        return "Person name is: " + getName() + ". Hotel is " + hotel + ", roomID is " + roomId;
    }
}
