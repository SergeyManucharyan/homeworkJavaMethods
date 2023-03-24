package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that removes from given sequence  all numbers that occur odd
 * number of times
 */
public class OddNumberArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        String str;
        int number;
        System.out.println("Enter a numbers");
        while ((str = sc.nextLine()).length() > 0) {
            try {
                number = Integer.parseInt(str);
                if(number%2!=0){
                    list.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid positive integer number");
            }
        }
        for (Integer e:list) {
            System.out.print(e+" ");
        }
    }
}
