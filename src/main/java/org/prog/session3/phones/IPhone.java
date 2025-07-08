package org.prog.session3.phones;

public class IPhone extends Phone {

    @Override
    public void call(String subscriber){
        System.out.println("Iphone calling " + subscriber);
    }
}
