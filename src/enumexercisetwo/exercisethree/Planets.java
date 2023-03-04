package enumexercisetwo.exercisethree;

public enum Planets {
    MERCURY(58000000, "3,285E23"),
    VENUS(108200000, "4,867E24"),
    EARTH(149600000, "5,972E24"),
    MARS(228000000, "6,39E23"),
    JUPITER(778000000, "1,898E27"),
    SATURN(1400000000, "5,683E26"),
    URANUS(2880000000L, "8,681E25"),
    NEPTUNE(4500000000L, "1,024E26");

    private final long distance;
    private final String mass;

    Planets(long distance, String mass) {
        this.distance = distance;
        this.mass = mass;
    }

    public long getDistance() {
        return distance;
    }

    public String getMass() {
        return mass;
    }
}
