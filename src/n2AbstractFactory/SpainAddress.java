package n2AbstractFactory;

import java.util.Scanner;

public class SpainAddress implements Contact{

    private final int ZIP_CODE_LENGTH = 5;

    private String address;

    @Override
    public void create() {
        String street;
        String city;
        String zipCode;
        String buildingNumber;
        String province;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the street");

        street = scanner.nextLine();

        System.out.println("Introduce the building number");

        buildingNumber = scanner.nextLine();

        do{

            System.out.println("Introduce the zip code (" + ZIP_CODE_LENGTH + " digits)");

            zipCode = scanner.nextLine();

            if(zipCode.length() != ZIP_CODE_LENGTH)
            {
                System.out.println("Error. The zipcode has to contain exactly 5 digits");

            }

        }while(zipCode.length() != 5);

        System.out.println("Introduce the city");

        city = scanner.nextLine();


        System.out.println("Introduce the province");

        province = scanner.nextLine();



        address = street + ", " + buildingNumber + ", " + zipCode + " ," + city + ", " + province;


    }

    @Override
    public void show() {
        System.out.println("Address: " + address + "\nCountry: Spain \n");
    }
}
