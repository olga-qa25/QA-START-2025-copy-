//package org.prog.session1;
//
/// /TODO: Homework make goTo accept String as parameter and say "color car goes to destination"
//
//public class Car {
//
//    public String color;
//
//    public void goToK(String destination) {
//
//        System.out.println(color + " car is going to " + destination);
//    }
//    public void goToO (String destination) {
//        System.out.println(color + " car is going to " + destination);
//    }
//}
package org.prog.session1;

//TODO: HW4: add String model and make equals & hashCode work by model and color
public class Car {

    public String color;
    public String model;

    public void goTo() {

        System.out.println(color + " car is going somewhere");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return this.color.equals(car.color) &&
                    this.model.equals(car.model);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return color.hashCode() + model.hashCode();
    }

    @Override
    public String toString() {

        return "Car : " + color;
    }

    public String getColor() {

        return color;
    }
}