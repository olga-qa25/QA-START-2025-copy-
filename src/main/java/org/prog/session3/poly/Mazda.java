package org.prog.session3.poly;

//TODO: write overloaded drive to to contain:
//TODO: - amount of passengers  def: 0
//TODO: - is payment for gas split def: no

public class Mazda implements ICar {

    public void driveTo(String destination) {
        driveTo(destination, "here and now");
    }

    public void driveTo(String destination, String from) {
        driveTo(destination, from, "nowhere");
    }

    private int passengers = 0;
    private boolean gasSplit = false;

    public void setPassengers(int passengers) {
        passengers = passengers;
        if (passengers > 0) gasSplit = true;
        else gasSplit = false;
    }
        @Override
        public void driveTo(String destination, String from, String stoppingAt) {
            System.out.println("Mazda drives from " + from + " to " + destination);
            System.out.println("Mazda stopping at " + stoppingAt);

            System.out.println("Amount of passengers: " + passengers);

            if (gasSplit) {
                System.out.println("The payment for gas is split among " + passengers + " passengers.");
            } else {
                System.out.println("The gas payment is not split.");
            }


        System.out.println("Mazada drives from " + from + " to " + destination);
        System.out.println("Mazada stopping at " + stoppingAt);
    }

    public void manualGearSwitch(int gear) {
        System.out.println("Switch to " + gear);
    }

    @Override
    public void turn(String direction) {
        System.out.println("Mazda turns " + direction);
    }

    @Override
    public void accelerate() {
        System.out.println("Mazda accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Mazba brakes");
    }
}
