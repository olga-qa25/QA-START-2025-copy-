package org.prog.oop;

import org.prog.Car;

public class InheritanceDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.goTo();

        BigCar bigCar = new BigCar();
        bigCar.color = "red";
        bigCar.model = "Fiat";

        bigCar.goTo();
        bigCar.goTo("Full drive");
        System.out.println(bigCar.carDescription());

        Truck truck = new Truck();
        truck.color = "black";
        truck.model = "Renault";

        truck.goTo();
    }
}
