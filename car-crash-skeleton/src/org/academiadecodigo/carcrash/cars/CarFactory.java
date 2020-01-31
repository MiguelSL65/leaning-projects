package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {

        int random = (int) (Math.random() * CarType.values().length);
        CarType carType = CarType.values()[random];

        Car car = null;

        switch (carType) {
            case FIAT:
                car = new Fiat();
                break;
            case MUSTANG:
                car = new Mustang();
        }

        return car;
    }
}
