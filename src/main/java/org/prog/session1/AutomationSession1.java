package org.prog.session1;

public class AutomationSession1 {

    public static void main(String[] args) {

        Car car = new Car();
        Car carOdessa = new Car();

        car.color = "red";
        carOdessa.color = "blue";

        car.goToK("Kyiv");
        carOdessa.goToO("Odessa");
    }
}
