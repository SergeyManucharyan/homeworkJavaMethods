package inheritsnceandabstractclass.abstractclass.exercisesix;

enum VehicleType{
    BUS,
    URBAN_RAIL,
    COMPUTER_RAIL
    };
enum WayType {
    DEDICATED,
    SHARED,
    MIXED
}
public class Main {
    public static void main(String[] args) {
        CreateMbta bus = new CreateMbta();
        CreateMbta vehicle = new CreateMbta();
        bus.setVehicle(VehicleType.BUS);
        bus.setWay(WayType.MIXED);
        System.out.println(bus.getVehicle()+" "+bus.getWay());
        vehicle.setWay(WayType.SHARED);
        vehicle.setVehicle(VehicleType.URBAN_RAIL);
        System.out.println(vehicle.getVehicle()+" "+vehicle.getWay());
    }
}
