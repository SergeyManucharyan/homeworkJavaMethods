package exception.exfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads an integer number and  calculates and prints its square root.
 * If the number is  invalid or negative, print "Invalid number". In all  cases finally print "Good bye". Use try-catch-finally.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/exception/exfive/text.txt");
        Scanner read = new Scanner(file);
        try {
            while (read.hasNext()) {
                if (read.hasNextInt()) {
                    int num = read.nextInt();
                    if (num > 0) {
                        System.out.println(Math.sqrt(num));
                    } else throw new InvalidOrNegativeNumber();
                }
            }
        } catch (InvalidOrNegativeNumber e) {
            System.out.println(e.getMessage());
            ;
        } finally {
            System.out.println("Good bye");
        }
    }
}
