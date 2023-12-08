package n2AbstractFactory;

import java.util.Scanner;

public class SpainFactory extends ContactAbstractFactory{

    private final int PHONE_NUMBER_LENGTH = 9;
    private final String PHONE_COUNTRY_CODE = "+34 ";

    private Contact contact = null;



    @Override
    public Contact getAddress() {
        if(contact == null)
        {
            contact = new SpainAddress();
        }
        return contact;
    }

    @Override
    public Contact getPhoneNumber() {
        if(contact == null)
        {
            contact = new SpainPhoneNumber();
        }
        return contact;
    }


}
