package n2AbstractFactory;

import java.util.Scanner;

public class USAFactory extends ContactAbstractFactory{



    private Contact contact = null;


    @Override
    public Contact getAddress() {
        if(contact == null)
        {
            contact = new USAAddress();
        }
        return contact;
    }

    @Override
    public Contact getPhoneNumber() {
        if(contact == null)
        {
            contact = new USAPhoneNumber();
        }
        return contact;
    }
}
