package org.studyeasy;
import org.studyeasy.vehicles.Bike;
import org.studyeasy.vehicles.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("petrol",2,2,"small","LED","short");
        System.out.println(bike.run());
        Car car = new Car("circle","FM","HighQuality",25, "Whilpoorl","TV");
        System.out.println(car.getMusicSystem());
    }
}