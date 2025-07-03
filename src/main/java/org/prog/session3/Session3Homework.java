package org.prog.session3;

import org.prog.session3.phones.IPhone;
import org.prog.session3.phones.Phone;
import org.prog.session3.phones.IPhone2;
import org.prog.session3.phones.ICamera;
import org.prog.session3.phones.WinPhone;
import org.prog.session3.phones.AndroidPhone;

public class Session3Homework {
public static void main (String [] args) {

    Phone phone = new Phone();
    IPhone iPhone = new IPhone();
    IPhone2 iPhone2 = new IPhone2();
    AndroidPhone androidPhone = new AndroidPhone();
    WinPhone winPhone = new WinPhone();

    phone.call("Jack");
    iPhone.call("Jack");
    iPhone2.call("Jack");
    androidPhone.call("Jack");
    winPhone.call("Jack");

    iPhone.photo();
    androidPhone.photo();
}
}
