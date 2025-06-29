package org.prog;

import java.util.Random;
import java.util.UUID;

//TODO: Create new Plane, set passengers, max passengers and flight id
// 1. write method that will tell how many seats are still available.
// 2. Write code which will fill plane with:
// - random max passsengers from [100 to 200]
// - random passengers on board up to maxPassengers;
// - random flight id as UUID
// 3. print number of planes with half or less seats taken
public class Session7 {

    public static void main(String[] args) {
        Plane7 plane = new Plane7();
        Random random = new Random();
        plane.current = random.nextInt(0,200);


        Random random1 = new Random();
        plane.max = random1.nextInt(100,200);

        if (plane.current > plane.max) {
            plane.current = plane.max;
        }

        System.out.println("Current passegers are "+ plane.current + ".");
        System.out.println("Max passegers are " + plane.max + ".");
        plane.id();
        plane.freeSeats();


    }
}
