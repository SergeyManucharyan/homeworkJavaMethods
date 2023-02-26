package inheritsnceandabstractclass.abstractclass.exercisesix;

public class CreateMbta implements Mbta{
    private VehicleType vehicle;
    private WayType way;

    public VehicleType getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleType vehicle) {
        this.vehicle = vehicle;
    }

    public WayType getWay() {
        return way;
    }

    public void setWay(WayType way) {
        this.way = way;
    }

    @Override
    public VehicleType vehicle(VehicleType vehicle) {
        return vehicle;
    }

    @Override
    public WayType way(WayType way) {
        return way;
    }
}
