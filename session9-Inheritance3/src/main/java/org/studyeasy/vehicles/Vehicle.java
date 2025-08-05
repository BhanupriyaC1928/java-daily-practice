package org.studyeasy.vehicles;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private String fuelTank;
    private String lights;

    public Vehicle() {
        engine = "petrol";
        wheels = 2;
        seats = 2;
        fuelTank = "petrol";
        lights = "brighter";
    }

    public Vehicle(String engine, int wheels, int seats, String fuelTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }
    public String run(){
        return "running";
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank='" + fuelTank + '\'' +
                ", lights='" + lights + '\'' +
                '}';
    }
}
