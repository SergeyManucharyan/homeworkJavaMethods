package setandmap.hashset;

import java.util.*;

/**
 * Create a HashSet of custom objects with a name and age field. Then, write a
 * comparator to sort the objects by age and print out the objects in order of
 * increasing age.
 */
public class HashSetOfCustomObject {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Anna", 23));
        people.add(new Person("Babken", 18));
        people.add(new Person("Vardan", 30));
        people.add(new Person("Edgar", 45));
        for (Person p : people) {
            System.out.println(p.getName() + " " + p.getAge());
        }
        System.out.println("-------------------");
        TreeSet<Person> treeSet = new TreeSet<>(people);
        for (Person p : treeSet) {
            System.out.println(p);
        }
    }
}
