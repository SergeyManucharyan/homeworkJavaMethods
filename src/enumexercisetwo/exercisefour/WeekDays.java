package enumexercisetwo.exercisefour;

public enum WeekDays {
    MONDAY("It's weekday", "work hard!!!"),
    TUESDAY("It's weekday", "work hard!!!"),
    WEDNESDAY("It's weekday", "work hard!!!"),
    THURSDAY("It's weekday", "work hard!!!"),
    FRIDAY("It's weekday", "work hard!!!"),
    SATURDAY("It's weekend", "Time to relax!!!"),
    SUNDAY("It's weekend", "Time to relax!!!");

    private final String dayInfo;
    private final String daType;

    WeekDays(String daType, String dayInfo) {
        this.dayInfo = dayInfo;
        this.daType = daType;
    }

    public String getDayInfo() {
        return dayInfo;
    }

    public String getDaType() {
        return daType;
    }
}
