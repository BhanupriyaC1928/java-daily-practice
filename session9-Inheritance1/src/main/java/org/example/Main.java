package org.example;

import org.example.vehicles.Bike;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Bike bike = new Bike();
     bike.handle = "Short";
//     bike.engine = "petrol";
        System.out.println(bike.engine);
    }
}