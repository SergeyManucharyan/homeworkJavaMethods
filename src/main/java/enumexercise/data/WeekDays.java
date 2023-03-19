package enumexercise.data;

/**
 * Create an enum representing the days of the week,
 * and write a method to return the number of the day
 */
public enum WeekDays {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    private final String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static int numOfDay (WeekDays weekDays){
        return weekDays.ordinal()+1;
    }
}
