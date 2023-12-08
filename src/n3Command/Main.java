package n3Command;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int vehicle = askInt("Choose a vehicle: \n" +
                "1. Car \n" +
                "2. Bike \n" +
                "3. Airplane \n" +
                "4. Ship \n");

        int action = askInt("Choose an action: \n" +
                "1. Start \n" +
                "2. Accelerate \n" +
                "3. Stop \n");

        executeCommand(vehicle, action);


    }

    public static int askInt(String message)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        int input = scanner.nextInt();

        return input;

    }

    public static void executeCommand(int vehicle, int action)
    {
        VehicleOperationExecutor vehicleOperationExecutor = null;

        switch(vehicle)
        {
            case 1:

                if(action == 1)
                {
                    vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStarts(new Vehicle("car")));

                }

                if(action == 2)
                {
                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleAccelerates(new Vehicle("car")));

                }

                if(action == 3)
                {
                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStops(new Vehicle("car")));

                }
                break;

            case 2:

                if(action == 1)
                {
                    vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStarts(new Vehicle("Bike")));

                }

                if(action == 2)
                {
                    vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleAccelerates(new Vehicle("Bike")));

                }

                if(action == 3)
                {
                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStops(new Vehicle("Bike")));

                }

                break;

            case 3:

                if(action == 1)
                {
                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStarts(new Vehicle("Airplane")));

                }

                if(action == 2)
                {
                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleAccelerates(new Vehicle("Airplane")));

                }

                if(action == 3)
                {
                    vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStops(new Vehicle("Airplane")));

                }

                break;

            case 4:

                if(action == 1)
                {
                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStarts(new Vehicle("Ship")));

                }

                if(action == 2)
                {

                     vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleAccelerates(new Vehicle("Ship")));

                }

                if(action == 3)
                {
                    vehicleOperationExecutor = new VehicleOperationExecutor(new VehicleStops(new Vehicle("Ship")));

                }

        }



        vehicleOperationExecutor.executeOperation();

    }
}


