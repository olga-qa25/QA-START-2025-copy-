package org.prog.session8;

import java.time.LocalDateTime;

public class Train {
    public static String trainType;

    public int id;
    public String destination;
    public int hours;
    public int minutes;

    public void depart() {
        String departHours;
        String departMinutes;
        if (hours < 10){
            departHours = "0"+hours;
        } else {
            departHours = ""+hours;
        }
        if (minutes < 10){
            departMinutes = "0"+minutes;
        } else {
            departMinutes = ""+minutes;
        }

        System.out.println("Train " + id + " departs " + departHours
                + ":" + departMinutes + " to " + destination);
    }
}
