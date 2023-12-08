package n2AbstractFactory;

import java.util.Scanner;

public class SpainPhoneNumber implements Contact{

    private final int PHONE_NUMBER_LENGTH = 9;
    private final String PHONE_COUNTRY_CODE = "+34 ";

    private String number;

    @Override
    public void create() {
        boolean correct = false;

        while(!correct) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce the phone number (" + PHONE_NUMBER_LENGTH + " digits)");

            String digits = scanner.nextLine();

            if (digits.length() == PHONE_NUMBER_LENGTH) {
                number = PHONE_COUNTRY_CODE + digits;
                correct = true;

            } else {
                System.out.println("The phone number should contain " + PHONE_NUMBER_LENGTH + " digits");
            }
        }
    }

    @Override
    public void show() {

        System.out.println("Phone number: " + number + "\nCountry: Spain \n");

    }
}
