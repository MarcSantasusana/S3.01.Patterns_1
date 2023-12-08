package n3Command;

public class VehicleAccelerates implements VehicleOperation{

   private Vehicle vehicle;

    public VehicleAccelerates(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
         vehicle.accelerates();
    }
}
