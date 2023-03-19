package exception.exseven;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter their age. If the user enters an age that is negative or greater than 120,
 * the program should throw an exception and print an error message.
 */
public class Main {
    public static void main(String[] args) throws AgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 0 || age > 120) {
            throw new AgeException();
        }
        System.out.println("You are "+age+" years old");
    }
}
