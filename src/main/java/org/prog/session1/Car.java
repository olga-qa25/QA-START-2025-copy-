package org.prog.session1;

//TODO: Homework make goTo accept String as parameter and say "color car goes to destination"

public class Car {

    public String color;
    public String destination;
    public String carName;

    public void goTo() {

        System.out.println(carName + " " + color + " car " + " went to " + destination);
    }
}