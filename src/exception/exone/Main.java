package exception.exone;

import java.util.Scanner;

/**
 * Write a program that reads an integer from the user and prints its reciprocal.
 * If the user enters 0, the program should throw an exception and print an error message.
 */
public class Main {
    public static void main(String[] args) throws ZeroException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter a number");
            int n = sc.nextInt();
            if (n == 0) {
                throw new ZeroException();
            }
            System.out.println("your number " + n);
        }
    }
}

