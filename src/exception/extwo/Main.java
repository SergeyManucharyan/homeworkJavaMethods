package exception.extwo;

import exception.exone.ZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that accepts an array of integers from the user and calculates the sum of its elements.
 * If the user enters a non-integer value, the program should throw an exception and print an error message.
 */
public class Main {
    public static void main(String[] args) throws NotIntegerException {
        int[] arr = new int[5];
        int m;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                m = sc.nextInt();
            } else {
                throw new NotIntegerException();
            }
            System.out.println("Your number "+m);
        }
    }
}

