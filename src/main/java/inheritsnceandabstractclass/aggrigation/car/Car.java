package inheritsnceandabstractclass.aggrigation.car;

public class Car {
    private String color;

    public Car(String color, int year, String engineType, String enginePower, String engineName) {
        this.color = color;
        this.year = year;
        this.engine =new Engine(engineType,enginePower,engineName);
    }

    @Override
    public String toString() {
        return "Color "+getColor()+"\nYear "+getYear()+"\nEngine type "+engine.getEngineType()+"\nEngine power "+engine.getEnginePower()+"\nEngine name "+engine.getEngineName();
    }

    private int year;
    private Engine engine;



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1960 && year < 2023) {
            this.year = year;
        }
    }
}

