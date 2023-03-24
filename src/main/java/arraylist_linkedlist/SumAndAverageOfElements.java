package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads from the console a  sequence of positive integer
 * numbers. The sequence  ends when empty line is entered. Calculate and print  the
 * sum and average of the elements of the  sequence. Keep the sequence in
 * ArrayList<int>.
 */
public class SumAndAverageOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str;
        int number;
        System.out.println("Enter a numbers");
        while ((str = sc.nextLine()).length() > 0) {
            try {
                number = Integer.parseInt(str);
                if (number > 0) {
                    list.add(number);
                } else {
                    System.out.println("Please enter a positive integer number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid positive integer number");
            }
        }
        int sum = 0;
        double avg = 0;
        for (Integer e : list) {
            System.out.print(e + " ");
            sum += e;
        }
        avg = (double) sum / list.size();
        System.out.println("\nSum of list elements " + sum);
        System.out.println("Average of list elements " + avg);
    }
}
