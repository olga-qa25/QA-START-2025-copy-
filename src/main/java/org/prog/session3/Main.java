package org.prog.session3;

public class Main {
    public static void main(String[] args) {
        ICamera cam1 = new AndroidPhone();
        ICamera cam2 = new IPhone();

        cam1.takePhoto();
        cam2.takePhoto();
    }
}
