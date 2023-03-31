package setandmap.linkedhashset;

import setandmap.hashset.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Write a program that takes in a LinkedHashSet of custom objects and
 * removes any objects that have a duplicate name field
 */
public class RemoveDuplicateName {
    public static void main(String[] args) {
        LinkedHashSet<Person> person = new LinkedHashSet<>();
        person.add(new Person("Anna", 23));
        person.add(new Person("Babken", 18));
        person.add(new Person("Babken", 33));
        person.add(new Person("Vardan", 30));
        person.add(new Person("Edgar", 45));
        person.add(new Person("Edgar", 27));

        Iterator<Person> itr = person.iterator();
        ArrayList<String> names = new ArrayList<>();
        while (itr.hasNext()) {
            String name = itr.next().getName();
            if (names.contains(name)) {
                itr.remove();
            } else {
                names.add(name);
            }
        }
        for (Person p : person) {
            System.out.println(p);
        }
    }
}
