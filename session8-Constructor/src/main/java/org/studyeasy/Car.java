package org.studyeasy;

public class Car {
    private String door;
    private  String engine;
    private String driver;
    private int speed;
//By providing default values
//    public Car() {
//        door = "closed";
//        engine = "off";
//        driver = "away";
//        speed = 0;
//    }
    //To take input from users

    public Car(String door, String engine, String driver, int speed) {
        this.door = door;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

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
