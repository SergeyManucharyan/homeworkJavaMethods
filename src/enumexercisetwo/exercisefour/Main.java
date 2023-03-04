package enumexercisetwo.exercisefour;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        String weekDay = sc.next().toUpperCase();
        try {
            WeekDays weekDays = WeekDays.valueOf(weekDay);
            System.out.println(weekDays.getDaType() + ". " + weekDays.getDayInfo());
        } catch (IllegalArgumentException e) {
            System.out.println("Please input correct day of the week");
            for (WeekDays d : WeekDays.values()) {
                System.out.println(d.name());
            }
        }
    }
}
