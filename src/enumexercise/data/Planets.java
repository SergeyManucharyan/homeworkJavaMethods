package enumexercise.data;

/**
 * Add a name field to the planets.
 * Create a name property to display a non-capitalized version of each of the planet names.
 * Add a constructor with the name field and a getter for the field.
 * add a new field called yearLength.
 */
public enum Planets {
    MERCURY("Mercury",88),
    VENUS("Venus",225),
    EARTH("Earth",365),
    MARS("Mars",687),
    JUPITER("Jupiter",4333),
    SATURN("Saturn",10759),
    URANUS("Uranus",30687),
    NEPTUNE("Neptune",60200);

    private final String name;
    private final int yearLength;

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getName(){
        return name;
    }
}
