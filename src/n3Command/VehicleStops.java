package n3Command;

public class VehicleStops implements VehicleOperation{

    private Vehicle vehicle;

    public VehicleStops(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {

        vehicle.stops();
    }
}
