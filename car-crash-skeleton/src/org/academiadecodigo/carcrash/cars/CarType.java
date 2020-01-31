package org.academiadecodigo.carcrash.cars;

public enum CarType {
    FIAT("F"),
    MUSTANG("M");

    private String firstChar;

    CarType (String firstChar) {
        this.firstChar = firstChar;
    }

    public String getFirstChar() {
        return this.firstChar;
    }


}

