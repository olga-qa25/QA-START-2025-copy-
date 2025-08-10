package org.prog.session3;

public class IPhone extends Phone implements ICamera{

    @Override
    public void call(String subscriber){
        System.out.println("Iphone calling " + subscriber);
    }

    @Override
    public void takePhoto() {
        System.out.println("iPhone takes a photo");
    }
}
