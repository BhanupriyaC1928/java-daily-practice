package org.studyeasy.vehicles;

public class Car extends Truck{
    public String fridge;
    public String entertainmentSystem;

    public Car(String steering, String musicSystem, String airConditioner, int container, String fridge, String entertainmentSystem) {
        super(steering, musicSystem, airConditioner, container);
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
