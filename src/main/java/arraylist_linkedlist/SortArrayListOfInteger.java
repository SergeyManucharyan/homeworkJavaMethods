package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Write a program that reads a sequence of integers  (ArrayList<int>) ending with an
 * empty line and sorts  them in an increasing orde
 */
public class SortArrayListOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str;
        int number;
        System.out.println("Enter a numbers");
        while ((str = sc.nextLine()).length() > 0) {
            try {
                number = Integer.parseInt(str);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid positive integer number");
            }
        }
        Collections.sort(list);
        for (Integer el : list) {
            System.out.print(el + " ");
        }
    }
}
