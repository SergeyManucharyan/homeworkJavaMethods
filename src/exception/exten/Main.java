package exception.exten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads a file name from the user and counts the number of words in the file.
 * If the file does not exist or cannot be opened,
 * the program should throw an exception and print an error message.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/exception/exte/text.txt");
        try {
            Scanner read = new Scanner(file);
            int count = 0;
            while (read.hasNext()) {
                read.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

