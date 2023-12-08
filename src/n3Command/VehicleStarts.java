package n3Command;

public class VehicleStarts implements VehicleOperation {

    private Vehicle vehicle;

    public VehicleStarts(Vehicle vehicle)
    {
       this.vehicle = vehicle;
    }
    @Override
    public void execute() {
         vehicle.starts();
    }
}
