package org.prog.session3.cars;

public class Ford extends Carriage  {

    public void drive(){}

    public void turn(){
        System.out.println("car turns");
    }

    private void smth(){
        childrenOnly();
    }
}
