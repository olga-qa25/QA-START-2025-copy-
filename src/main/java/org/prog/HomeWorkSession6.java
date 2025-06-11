package org.prog;

//TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max passengers and flight id

public class HomeWorkSession6 {
    public static void main(String[] args) {
        Plane passengerCurrent = new Plane();
        Plane passengerMax = new Plane();
        Plane passengerId = new Plane();

        passengerCurrent.current = 5;
        passengerMax.max = 50;
        passengerId.id = "AA-1001";



        System.out.println("Current passengers :" + passengerCurrent.current);
        System.out.println("Max Passengers" + " : " + passengerMax.max);
        System.out.println("ID is " + passengerId.id);

        passengerId.goTo();
        System.out.println(passengerId);

//        Car aliceCar = new Car();
//        Car bobCar = new Car();
//
//        aliceCar.color = "blue";
//        aliceCar.model = "3";
//        bobCar.color = "red";
//
//        System.out.println(aliceCar.color);
//        System.out.println(bobCar.color);
//
//        aliceCar.goTo();
//        bobCar.goTo();
//
//        aliceCar.refuel(25, "diesel");
//        bobCar.refuel(15, "gasoline");
//
//       System.out.println(aliceCar.model);
//        System.out.println(bobCar.model);
//
//        String s1 = "some string";
//        String s2 = "";
//        String s3 = null;
    }
}
