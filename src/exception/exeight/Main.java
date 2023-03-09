package exception.exeight;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Write a program that reads a string from the user and checks if it is a valid email address. If the string is not a valid email address,
 * the program should throw an exception and print an error message.
 */
public class Main {
    public static void main(String[] args) throws EmailFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid email");
        String email=sc.next();
        if(!Pattern.matches("[a-zA-Z]+[a-zA-Z0-9-_.]*@[a-z]*.[a-z]*", email)){
            throw new EmailFormatException();
        };
        System.out.println(email);
    }
}


