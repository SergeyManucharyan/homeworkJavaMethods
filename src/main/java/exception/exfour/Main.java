package exception.exfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads a file name from the user and prints its contents to the console.
 * If the file does not exist or cannot be opened, the program should throw an exception and print an error message
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("sr/exception/exfour/text.txt");
        try {
            Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        }catch (FileNotFoundException e){
        System.out.println(e.getMessage());
    }
    }
}
