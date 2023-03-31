package setandmap.hashset;

import java.util.HashSet;

/**
 * Write a program that takes a HashSet of strings and returns a new HashSet
 * containing only the unique words in the original set, ignoring case
 */
public class HashSetUniqueWord {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("One");
        set.add("two");
        set.add("Two");
        set.add("three");
        set.add("Three");
        HashSet<String> uniqueSet = new HashSet<>();
        for (String str : set) {
            uniqueSet.add(str.toLowerCase());
        }
        for (String str : uniqueSet) {
            System.out.println(str);
        }
    }
}
