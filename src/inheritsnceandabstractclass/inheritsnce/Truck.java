package inheritsnceandabstractclass.inheritsnce;

public class Truck extends Car{
    public Truck(int passengerCount, String engineType, int capacity) {
        super(passengerCount, engineType);
        this.capacity = capacity;
    }
    public void show(){
        System.out.print(this.getPassengerCount()+" ");
        System.out.print(this.getEngineType()+" ");
        System.out.println(this.capacity);
    }

    int capacity = 0;

}
