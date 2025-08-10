package org.prog.session5;

import java.util.*;

public class HWMapDemo {

    public static void main(String[] args) {
        String owner1 = "Vova";
        String owner2 = "Sasha";
        String owner3 = "Olga";
        String owner4 = "Masha";

        Map<String, List<String>> carsMap = new HashMap<>();

        carsMap.put(owner1, new ArrayList<>());
        carsMap.put(owner2, new ArrayList<>());
        carsMap.put(owner3, new ArrayList<>());
        carsMap.put(owner4, new ArrayList<>());

        carsMap.get(owner1).add(randomColor() + " BMW");
        carsMap.get(owner2).add(randomColor() + " Audi");
        carsMap.get(owner3).add(randomColor() + " Mazda");
        carsMap.get(owner4).add(randomColor() + " Tesla");

        for (String owner : carsMap.keySet()) {
            for (String car : carsMap.get(owner)) {
                System.out.println(owner + " owns " + car);
            }
        }
    }

    public static String randomColor() {
        Random random = new Random();
        return switch (random.nextInt(5)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "pink";
            default -> "black";
        };
    }
}

