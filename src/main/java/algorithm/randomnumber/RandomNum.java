package algorithm.randomnumber;

import java.util.Random;

/**
 * Write a program that generates a random number between 1 and 100
 * (you can use the Random ( ) method from the Math class.
 * the next step check whether it is an even or an odd number. Each of
 * the above actions should be written to the console.
 */
public class RandomNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println(n + " " + (n % 2 == 0 ? "even" : "odd"));
    }
}
