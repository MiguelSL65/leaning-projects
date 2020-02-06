package org.academiadecodigo.rhashtafaris.hotelguest;

public class Hotel {

    private String name;
    private Room[] rooms;

    public Hotel (String hotelName, int numOfRooms) {
        this.name = hotelName;
        this.rooms = new Room[numOfRooms];
    }

    public int isCheckIn() {

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i] == null) {
                rooms[i] = new Room();
            }

            if (rooms[i].isAvailable()) {
                rooms[i].setAvailable(false);
            }
        }

        return -1; // return -1 if there are no rooms available.
    }

    public void checkOut(int roomId) {

        if (rooms[roomId] != null) {
            rooms[roomId].setAvailable(true);
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name +  "rooms=" + rooms.length + "}";
    }

}
