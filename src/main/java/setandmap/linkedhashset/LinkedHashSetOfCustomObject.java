package setandmap.linkedhashset;

import setandmap.hashset.Person;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Create a LinkedHashSet of custom objects with a name and age field. Then,
 * write a comparator to sort the objects by age and print out the objects in
 * order of increasing age.
 */
public class LinkedHashSetOfCustomObject {
    public static void main(String[] args) {
        LinkedHashSet<Person> people = new LinkedHashSet<>();
        people.add(new Person("Anna", 23));
        people.add(new Person("Babken", 18));
        people.add(new Person("Vardan", 30));
        people.add(new Person("Edgar", 45));
        TreeSet<Person> treeSet = new TreeSet<>(people);
        for (Person p : treeSet) {
            System.out.println(p.getAge());
        }
    }
}
