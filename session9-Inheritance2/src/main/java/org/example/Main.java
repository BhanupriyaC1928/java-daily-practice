package org.example;

import org.example.Vehicles.Bike;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike.getHandle());
        System.out.println(bike.getFuelTank());
    }
}