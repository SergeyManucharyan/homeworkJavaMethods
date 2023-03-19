package algorithm.largendsmall;

import java.util.Random;

/**
 * Write a program that will use the while loop to find the largest and
 * smallest number from the set of 10 randomly drawn integers from 1 to
 * 100. In this task, do not use arrays or other collections.
 * import java.util.Random;
 */

public class LargeAndSmall {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10, min = 100, max = 1;
        while (count > 0) {
            int r = random.nextInt(100);
            System.out.println(r);
            if (r > max) {
                max = r;
            }
            if (r < min) {
                min = r;
            }
            count--;
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}
