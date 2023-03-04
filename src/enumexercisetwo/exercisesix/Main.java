package enumexercisetwo.exercisesix;

import enumexercisetwo.exercisesix.methods.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaSize size = PizzaSize.SMALL;
        int toppings = 0;
        Scanner sc = new Scanner(System.in);
        Pizza p = new Pizza();
        size = p.size(size);
        toppings = p.topping();
        System.out.println("Your pizza will cost $" + (size.getPrize() + toppings * 1.5));
        System.out.println("Toppings");
        for (Topping t : Topping.values()) {
            if (t.ordinal() < toppings) {
                System.out.print(t.getName() + " ");
            } else {
                break;
            }
        }
    }
}
