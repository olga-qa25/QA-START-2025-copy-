package org.prog;
import java.util.UUID;

public class Plane7 {
    int current;
    int max;
    int i = max-current;

    public void freeSeats(){
        System.out.println("Free seats are " + (max-current) + ".");
    }

    public void id (){
        System.out.println("Flight id is " + (UUID.randomUUID().toString()) + ".");
    }
}
