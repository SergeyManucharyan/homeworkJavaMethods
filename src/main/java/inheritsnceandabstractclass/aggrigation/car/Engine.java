package inheritsnceandabstractclass.aggrigation.car;

public class Engine {
    private String engineType;
    private String enginePower;

    public Engine(String engineType, String enginePower, String engineName) {
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    private String engineName;
}
