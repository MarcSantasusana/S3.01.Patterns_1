package n3Command;


public class VehicleOperationExecutor {

    VehicleOperation vehicleOperation;

    public VehicleOperationExecutor(VehicleOperation vehicleOperation)
    {
        this.vehicleOperation = vehicleOperation;
    }


    public void executeOperation()
    {
        vehicleOperation.execute();
    }
}
