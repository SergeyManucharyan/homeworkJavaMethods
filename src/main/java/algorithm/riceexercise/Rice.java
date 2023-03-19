package algorithm.riceexercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Provided that you have a given number of small rice bags (1 kilo each)
 * and big rice bags (5 kilos each), write a method that returns true if it is
 * possible to make a package with goal kilos of rice
 */
public class Rice {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter quantity of rice");
            int rice = sc.nextInt();
            if (rice < 1) {
                throw new ZeroException();
            }
            System.out.println("Enter 1 kilo bags count");
            int oneKiloBags = sc.nextInt();
            System.out.println("Enter 5 kilo bags count");
            int fiveKiloBags = sc.nextInt();
            if (oneKiloBags < 0 || fiveKiloBags < 0) {
                throw new NegativeException();
            }
            System.out.println(riceCalculator(rice, oneKiloBags, fiveKiloBags));
        } catch (InputMismatchException e) {
            System.out.println("Please enter only whole number");
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        } catch (NegativeException e) {
            e.getMessage();
        }
    }

    public static boolean riceCalculator(int rice, int one, int five) {
        if (rice > 5 * five + one) {
            return false;
        }
        while (five != 0 && rice > -1) {
            rice -= 5;
            five--;
        }
        return rice <= one || rice == 0;
    }
}
