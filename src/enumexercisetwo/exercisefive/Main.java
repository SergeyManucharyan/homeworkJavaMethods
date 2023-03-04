package enumexercisetwo.exercisefive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature between -30 40");
        boolean bool = true;
        try {
            int temp = sc.nextInt();
            for (Season s : Season.values()) {
                if (temp >= s.getMin() && temp <= s.getMax()) {
                    System.out.println("The temperature corresponds to " + s);
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.println("Temperature must be in range -30 +40");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Input must be integer number");
        }
    }
}
