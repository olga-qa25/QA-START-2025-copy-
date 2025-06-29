package org.prog;

//TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max passengers and flight id

public class HomeWorkSession6 {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.current = 50;
        plane.max = 250;
        plane.id = "AA-1001";


        System.out.println("Current passengers :" + plane.current);
        System.out.println("Max Passengers" + " : " + plane.max);
        System.out.println("ID is " + plane.id);
        System.out.println();

        plane.goTo();
        System.out.println();
        plane.freeSeats();
        System.out.println();
    }
}