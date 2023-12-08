package n2AbstractFactory;

public abstract class ContactAbstractFactory {

    private static ContactAbstractFactory contactAbstractFactory;

    public static ContactAbstractFactory getContactAbstractFactory()
    {
        return contactAbstractFactory;
    }

    public static void setContactAbstractFactory(ContactAbstractFactory contactAbstractFactory)
    {
        ContactAbstractFactory.contactAbstractFactory = contactAbstractFactory;
    }

    public abstract Contact getAddress();

    public abstract Contact getPhoneNumber();


}
