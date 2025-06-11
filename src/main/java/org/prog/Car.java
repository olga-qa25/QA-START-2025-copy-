package org.prog;

public class Car {

    public static String wheelShape;

    public String color;
    public String model;

    //TODO: Add method parameter with destination
    public void goTo() {
        System.out.println(color + " car is going somewhere new!");
    }

    public static void goToStatic(){
        System.out.println("this is static method");
    }

    public String carDescription() {
        //smth is happening here
        return "This car is a " + color + " " + model;
    }

//    public void refuel(String fuelType)
//    {}
//    public void refuel(int amount)
//    {}
//    public void refuel(String fuelType, int amount)
//    {}

    public void refuel(int amount, String fuelType) {
        System.out.println(color + " car is refueling " + amount + " liters of " + fuelType);
    }

    public int getModelLength(){
        if (model == null) {
            return 0;
        }
        return model.length();
    }
}
