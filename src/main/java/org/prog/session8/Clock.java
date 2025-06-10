package org.prog.session8;

public class Clock {
    public int hour;
    public int minute;

    public void tick() {
        minute++;
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
    }
}
