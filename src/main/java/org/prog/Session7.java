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
// 4. * - make at least 50 planes in array
//    * - sort planes by percentage of seats takes

public class Session7 {

    public static void main(String[] args) {
//        Car.wheelShape = "round";
//        Car.goToStatic();
////
//        Car aliceCar = new Car();
//        aliceCar.color = "blue";
//        aliceCar.model = "BMW";
//
//        String aliceCarDesc = aliceCar.carDescription();
//        System.out.println(aliceCarDesc);
//
//        String s = "asd";

        System.out.println(UUID.randomUUID().toString());
        Random random = new Random();
        random.nextInt(10);
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100, 200));
        }
    }
}
