package org.studyeasy.vehicles;

public class Truck {
    public String steering;
    public String musicSystem;
    public String airConditioner;
    public int container;

    public Truck(String steering, String musicSystem, String airConditioner, int container) {
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                '}';
    }
}
