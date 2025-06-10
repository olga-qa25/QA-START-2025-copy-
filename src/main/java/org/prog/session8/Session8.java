package org.prog.session8;

import java.util.Random;

public class Session8 {

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hour = 0;
        clock.minute = 0;

        Random rand = new Random();

        String[] cities = new String[5];
        cities[0] = "Kyiv";
        cities[1] = "Lviv";
        cities[2] = "Odessa";
        cities[3] = "Dnipro";
        cities[4] = "Khrakiv";

        Train[] trains = new Train[15];

        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();
            trains[i].id = rand.nextInt(1000, 10000);
            trains[i].destination = cities[rand.nextInt(cities.length)];
            trains[i].hours = rand.nextInt(24);
            trains[i].minutes = rand.nextInt(60);
        }

        for (int minutes = 0; minutes < 1440; minutes++) {
            clock.tick();
            for (int trainIndex = 0; trainIndex < trains.length; trainIndex++) {
                if (clock.hour == trains[trainIndex].hours && clock.minute == trains[trainIndex].minutes) {
                    trains[trainIndex].depart();
                    break;
                }
            }
        }
    }
}
