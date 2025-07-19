package org.prog;

//TODO: Add second car, make it blue, make red car got to Kyiv, blue car go to Odessa
public class AutomationSession1 {

    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car();

        car.color = "red";
        car1.color = "blue";

        car.goToKyiv();
        car1.goToOdessa();
    }
}
