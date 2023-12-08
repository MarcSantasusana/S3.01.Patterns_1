package n2AbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
      List<Contact> agenda = new ArrayList<>();

        boolean quit = false;

        do {


            int option;

            option = askInt("0. Quit \n" +
                    "1. Add phone number to agenda \n" +
                    "2. Add address to agenda \n" +
                    "3. Show agenda \n");

            switch (option) {

                case 0:

                    quit = true;
                    break;

                case 1:

                    addPhoneNumberToAgenda(agenda);

                    break;

                case 2:

                    addAddressToAgenda(agenda);

                    break;

                case 3:

                    showAgenda(agenda);

                    break;


                default:

                    System.out.println("This option is not valid");
            }

        }while(!quit);
    }

    public static int askInt(String message)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        int input = scanner.nextInt();

        return input;

    }



    public static void addPhoneNumberToAgenda(List<Contact> agenda)
    {

      int chosenCountry = askInt("Choose what country this phone number is from: \n" +
              "1. Spain \n" +
              "2. USA \n" +
              "3. China \n");


      chooseFactory(chosenCountry);

      ContactAbstractFactory contactAbstractFactory = ContactAbstractFactory.getContactAbstractFactory();

      Contact phoneNumber = contactAbstractFactory.getPhoneNumber();

      phoneNumber.create();

      agenda.add(phoneNumber);


    }



    public static void addAddressToAgenda(List<Contact> agenda)
    {
        int chosenCountry = askInt("Choose what country this address is from: \n" +
                "1. Spain \n" +
                "2. USA \n" +
                "3. China \n");


        chooseFactory(chosenCountry);

        ContactAbstractFactory contactAbstractFactory = ContactAbstractFactory.getContactAbstractFactory();

        Contact address = contactAbstractFactory.getAddress();

        address.create();

        agenda.add(address);

    }

    public static void chooseFactory(int chosenCountry)
    {
        switch(chosenCountry)
        {
            case 1:

                ContactAbstractFactory.setContactAbstractFactory(new SpainFactory());
                break;

            case 2:

                ContactAbstractFactory.setContactAbstractFactory(new USAFactory());
                break;

            case 3:

                ContactAbstractFactory.setContactAbstractFactory(new ChinaFactory());
                break;

        }
    }

    public static void showAgenda(List<Contact> agenda)
    {
        agenda.forEach(Contact::show);
    }


}
