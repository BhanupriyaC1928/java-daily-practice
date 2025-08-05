package org.studyeasy;

public class Car {
    private String door;
    private  String engine;
    private String driver;
    private int speed;

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        if(door.toLowerCase().equals("closed") && engine.toLowerCase().equals("on") && driver.toLowerCase().equals("seated") && speed>0){
            System.out.println("running");
        }
        else{
            System.out.println("not running");
        }
    }
}
