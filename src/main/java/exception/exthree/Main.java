package exception.exthree;

import java.util.Scanner;

/**
 * Write a program that reads two numbers from the user and divides them. If the user enters 0 as the second number,
 * the program should throw an exception and print an error message.
 */
public class Main {
    public static void main(String[] args) throws DivideByZeroException {
        Scanner firstNum = new Scanner(System.in);
        Scanner secondNum = new Scanner(System.in);
        System.out.println("Enter first number");
            double n=firstNum.nextDouble();
        System.out.println("Enter second number");
            double m=secondNum.nextDouble();
            if(m==0)throw new DivideByZeroException();
            System.out.println(n/m);
    }
}
