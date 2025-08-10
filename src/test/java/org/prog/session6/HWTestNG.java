package org.prog.session5;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;

public class HWTestNG {

    private Map<String, List<String>> carsMap;
    private final String owner1 = "Vova";
    private final String owner2 = "Sasha";
    private final String owner3 = "Olga";
    private final String owner4 = "Masha";

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before all");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }

    @Test
    public void testCarsMap() {
        carsMap = new HashMap<>();

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

    private String randomColor() {
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