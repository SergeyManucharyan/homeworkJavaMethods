package setandmap.linkedhashset;

import java.util.LinkedHashSet;

/**
 * Write a program that takes in a LinkedHashSet of integers and removes any
 * even numbers from the set
 */
public class SetWithoutEven {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        LinkedHashSet<Integer> integersOdd = new LinkedHashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        for (Integer i : integers) {
            if (i % 2 != 0) {
                integersOdd.add(i);
            }
        }
        integers = new LinkedHashSet<>(integersOdd);
        for (Integer i : integers) {
            System.out.println(i);
        }

    }
}

