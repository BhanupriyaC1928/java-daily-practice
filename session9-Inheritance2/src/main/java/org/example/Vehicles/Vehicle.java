package org.example.Vehicles;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private String fuelTank;
    private String lights;

    public Vehicle() {
        wheels = 2;
        seats = 2;
        fuelTank = "petrol";
        lights = "brighter";
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }
}
