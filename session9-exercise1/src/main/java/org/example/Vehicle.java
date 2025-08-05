package org.example;

public class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }
    public Vehicle() {
        this.speed = 20;
    }

    public void move(){
        if(speed>0){
            System.out.println("moving..");
        }
         else{
            System.out.println("car is not moving..");
        }
    }
}
