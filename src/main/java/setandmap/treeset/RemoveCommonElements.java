package setandmap.treeset;

import java.util.TreeSet;

/**
 * Write a program that takes in two TreeSets of integers and returns a new set
 * containing only the elements that are in the first set but not in the second
 * set
 */
public class RemoveCommonElements {
    public static void main(String[] args) {
        TreeSet<Integer> setOne=new TreeSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);
        setOne.add(5);
        TreeSet<Integer> setTwo=new TreeSet<>();
        setTwo.add(10);
        setTwo.add(20);
        setTwo.add(30);
        setTwo.add(4);
        setTwo.add(5);
        TreeSet<Integer> result=new TreeSet<>(setOne);
        result.removeAll(setTwo);
        for (Integer i:result) {
            System.out.println(i);
        }
    }
}
