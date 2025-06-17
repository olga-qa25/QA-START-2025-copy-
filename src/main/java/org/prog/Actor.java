package org.prog;

import java.awt.*;

public class Actor {
    public String name;

    public void say(String message) {
        System.out.println(this.name + " says " + message);
    }

    public void walkTo(String destination) {
        System.out.println(this.name + " walks to " + destination);
    }
}
