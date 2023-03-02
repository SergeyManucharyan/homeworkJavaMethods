package enumexercise.data;

/**
 * Create a Java enum called Unit that represents the following units of measure: METER, KILOGRAM, SECOND, AMPERE, KELVIN, MOLE, and CANDELA.
 * Each unit should have a method called getBaseUnit() that returns the base unit of measure (either itself, or the unit it is derived from).
 * For example, the base unit of measure for KILOGRAM is itself, but the base unit of measure for NEWTON (a derived unit) is KILOGRAM * METER / SECOND^2.
 */
public enum Unit {
    METER {
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
            return CELSIUS + " = " + KELVIN + " + 273,15";
        }
    },
    KELVIN {
        @Override
        public String getBaseUnit() {
            return KELVIN + " = " + CELSIUS + " - 273,15";
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
            return NEWTON + " = " + KILOGRAM + " * " + METER + " / " + SECOND + " ^ " + 2;
        }
    };

    public abstract String getBaseUnit();
}
