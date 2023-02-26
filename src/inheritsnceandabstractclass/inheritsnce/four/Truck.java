package inheritsnceandabstractclass.inheritsnce.four;

public class Truck extends Car{
    int capacity = 0;

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return  "capacity= " + capacity +
                " passenger= "+super.getPassengerCount()+
                " enginetype= "+super.getEngineType();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
