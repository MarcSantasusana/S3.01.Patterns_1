package n2AbstractFactory;

import java.util.Scanner;

public class USAAddress implements Contact{

    private final int ZIP_CODE_LENGTH = 5;

    private String address;

    @Override
    public void create() {
        String street;
        String city;
        String zipCode;
        String buildingNumber;
        String state;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the street");

        street = scanner.nextLine();

        System.out.println("Introduce the building number");

        buildingNumber = scanner.nextLine();

        System.out.println("Introduce the city");

        city = scanner.nextLine();

        System.out.println("Introduce the state");

        state = scanner.nextLine();

        do{

            System.out.println("Introduce the zip code (" + ZIP_CODE_LENGTH + " digits)");

            zipCode = scanner.nextLine();

            if(zipCode.length() != ZIP_CODE_LENGTH)
            {
                System.out.println("Error. The zipcode has to contain exactly 5 digits");

            }

        }while(zipCode.length() != 5);



        address = street + ", " + buildingNumber + ", " + city + ", " + state + ", " + zipCode;


    }

    @Override
    public void show() {
        System.out.println("Address: " + address + "\nCountry: USA \n");
    }
}
