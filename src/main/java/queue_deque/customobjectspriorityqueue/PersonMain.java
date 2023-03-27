package queue_deque.customobjectspriorityqueue;

import java.util.PriorityQueue;

public class PersonMain {
    public static void main(String[] args) {
        PriorityQueue<Person> p = new PriorityQueue<>(new PersonAgeComparator());
        p.add(new Person("Arman", 25));
        p.add(new Person("Hajk", 18));
        p.add(new Person("Babken", 50));
        System.out.println(p);
    }
}
