package inheritsnceandabstractclass.inheritsnce;

public class Car {
    private int passengerCount;
    private String engineType;

    public Car(int passengerCount, String engineType) {
        setPassengerCount(passengerCount);
        setEngineType(engineType);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Passenger count must be higher or equal 2");
        }
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        boolean isLetter = true;
        for (int i = 0; i < engineType.length(); i++) {
            if (!(engineType.charAt(i) >= 65 && engineType.charAt(i) <= 90 || engineType.charAt(i) >= 97 && engineType.charAt(i) <= 122)) {
                isLetter = false;
                break;
            }
        }
        if (isLetter) {
            this.engineType = engineType;
        } else {
            System.out.println("Engine Type must be only letters");
        }
    }
}
