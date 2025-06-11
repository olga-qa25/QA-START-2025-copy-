package org.prog.oop;

import java.awt.*;

public class Bakery {

    public static void main(String[] args) {
        int grain = 100;
        int water = 10;
        int yeast = 100;

        int flour = grindGrain(grain);
        int opara = water + yeast;

        opara += flour/10;

        int dough = makeDough(opara, "something");

    }

    public static int grindGrain(int grain) {
        return grain / 2;
    }

    public static int makeDough(int opara, String doughType){
        System.out.println(doughType);
        return opara/2;
    }
}
