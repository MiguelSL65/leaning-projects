package org.academiadecodigo.rhashtafaris.hotelguest;

public class Main {

    public static void main(String[] args) {

        Hotel myHotel = new Hotel ("Grand Budapest Hotel" , 100);
        Guest miguel = new Guest("Miguel");

        miguel.setHotel(myHotel);

        if (!miguel.isCheckin()) {
            System.out.println("Could not get a room for " + miguel.getName());
        }

        miguel.isCheckOut();

        System.out.println(myHotel);
        System.out.println(miguel);
    }
}
