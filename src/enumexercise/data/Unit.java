package enumexercise.data;

public enum Unit {
    METER{
        @Override
        public String getBaseUnit() {
            return null;
        }
    },
    KILOGRAM {
        @Override
        public String getBaseUnit() {
            return KILOGRAM.toString();
        }
    },
    SECOND {
        @Override
        public String getBaseUnit() {
            return SECOND.toString();
        }
    },
    CELSIUS {
        @Override
        public String getBaseUnit() {
            return CELSIUS+" = "+ KELVIN+" + 273,15";
        }
    },
    KELVIN {
        @Override
        public String getBaseUnit() {
            return KELVIN+" = "+ CELSIUS+" - 273,15";
        }
    },
    MOLE {
        @Override
        public String getBaseUnit() {
            return MOLE.toString();
        }
    },
    CANDELA {
        @Override
        public String getBaseUnit() {
            return CANDELA.toString();
        }
    },
    NEWTON {
        @Override
        public String getBaseUnit() {
            return NEWTON+" = "+KILOGRAM+" * "+METER+" / "+SECOND+" ^ "+2;
        }
    };
    public abstract String getBaseUnit();
}
