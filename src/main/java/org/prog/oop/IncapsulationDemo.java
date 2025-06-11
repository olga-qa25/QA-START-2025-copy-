package org.prog.oop;

import org.prog.Car;

public class IncapsulationDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.model = "BMW";
        System.out.println(car.getModelLength());
        //....
        car.model = null;
        System.out.println(car.getModelLength());

    }
}
