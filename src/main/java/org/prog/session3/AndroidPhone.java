package org.prog.session3;

public class AndroidPhone extends Phone implements ICamera {
    @Override
    public void takePhoto() {
        System.out.println("Android phone takes a photo");
    }
}
