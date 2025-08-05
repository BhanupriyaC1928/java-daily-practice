package org.example;

public class Car extends Vehicle{
     private int speedLevel;
    public Car() {
        super();
        this.speedLevel =150;
    }

    public void speed(){
        if (speedLevel>getSpeed()){
            System.out.println("Car is fast");
        }
    }
}
