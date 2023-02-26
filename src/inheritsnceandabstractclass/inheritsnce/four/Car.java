package inheritsnceandabstractclass.inheritsnce.four;

public class Car {
    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = Math.max(passengerCount, 2);
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if (Character.isAlphabetic(engineType))
            this.engineType = engineType;
    }

}