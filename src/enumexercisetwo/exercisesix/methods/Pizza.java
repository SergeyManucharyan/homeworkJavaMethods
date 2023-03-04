package enumexercisetwo.exercisesix.methods;

import enumexercisetwo.exercisesix.PizzaSize;
import enumexercisetwo.exercisesix.Topping;

import java.util.Scanner;

public class Pizza {
    /**
     * @param s enum PizzaSize
     * @return size of pizza
     */
    public PizzaSize size(PizzaSize s) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("What size pizza would you like? (small, medium, large)");
                s = PizzaSize.valueOf(sc.next().toUpperCase());
                return s;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input");
            }
        }
    }

    /**
     * check topping count
     *
     * @return topping count
     */
    public int topping() {
        Scanner sc = new Scanner(System.in);
        int toppings = 0;
        while (true) {
            System.out.println("How many toppings would you like? (1-5)");
            toppings = sc.nextInt();
            if (toppings > 0 && toppings < 6) {
                return toppings;
            }
            System.out.println("Wrong input");
        }
    }
}
