package n2AbstractFactory;

import java.util.Scanner;

public class ChinaAddress implements Contact{

    private final int ZIP_CODE_LENGTH = 6;

    private String address;

    @Override
    public void create() {
        String street;
        String city;
        String zipCode;
        String buildingNumber;
        String province;


        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Introduce the zip code (" + ZIP_CODE_LENGTH + " digits)");

            zipCode = scanner.nextLine();

            if(zipCode.length() != ZIP_CODE_LENGTH)
            {
                System.out.println("Error. The zipcode has to contain exactly 6 digits");

            }

        }while(zipCode.length() != 6);

        System.out.println("Introduce the province");

        province = scanner.nextLine();

        System.out.println("Introduce the city");

        city = scanner.nextLine();

        System.out.println("Introduce the street");

        street = scanner.nextLine();

        System.out.println("Introduce the building number");

        buildingNumber = scanner.nextLine();


        address = zipCode + ", " + province + ", " + city + ", " + street + ", " + buildingNumber;


    }

    @Override
    public void show() {
        System.out.println("Address: " + address + "\nCountry: China \n");
    }
}
