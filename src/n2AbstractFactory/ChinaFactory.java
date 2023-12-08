package n2AbstractFactory;

import java.util.Scanner;

public class ChinaFactory extends ContactAbstractFactory{

    private Contact contact = null;



    @Override
    public Contact getAddress() {
        if(contact == null)
        {
            contact = new ChinaAddress();
        }
        return contact;
    }

    @Override
    public Contact getPhoneNumber() {
        if(contact == null)
        {
            contact = new ChinaPhoneNumber();
        }
        return contact;
    }
}
