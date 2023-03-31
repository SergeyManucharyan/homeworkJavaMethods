package setandmap.hashset;

import java.util.HashSet;

/**
 * Write a program that takes two HashSets of integers and finds the common
 * elements between them
 */
public class HashSetCommonElements {
    public static void main(String[] args) {
        HashSet<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);
        setOne.add(5);
        HashSet<Integer> setTwo = new HashSet<>();
        setTwo.add(3);
        setTwo.add(4);
        setTwo.add(5);
        setTwo.add(6);
        setTwo.add(7);
        setTwo.add(8);
        setOne.retainAll(setTwo);
        for (Integer el : setOne) {
            System.out.println(el);
        }
    }
}
