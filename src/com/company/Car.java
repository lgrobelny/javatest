package com.company;

public class Car {
    private String name;
    private int maxKmH;
    private int numberOfDoors;
    private boolean areDoorsClosed;

    public Car(String name, int maxKmH, int numberOfDoors, boolean areDoorsClosed){
        this.name = name;
        this.maxKmH = maxKmH;
        this.numberOfDoors = numberOfDoors;
        this.areDoorsClosed = areDoorsClosed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxKmH() {
        return maxKmH;
    }

    public void setMaxKmH(int maxKmH) {
        this.maxKmH = maxKmH;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean getAreDoorsClosed() {
        return areDoorsClosed;
    }

    public void setAreDoorsClosed(boolean areDoorsClosed) {
        this.areDoorsClosed = areDoorsClosed;
    }
}
