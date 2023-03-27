package queue_deque;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("CustomDeque");
//        1. Implement a queue using LinkedList and add elements to it.
        CustomDeque<Integer> cq = new CustomDeque<>();
        cq.addFirst(1);
        cq.addFirst(2);
        cq.addFirst(3);
        System.out.println(cq);
        cq.addLast(1);
        cq.addLast(2);
        cq.addLast(3);
        System.out.println(cq);
//        2. Implement a deque using LinkedList and add elements to it.
        System.out.println("CustomQueue");
        CustomQueue<String> cd = new CustomQueue<>();
        cd.add("aaa");
        cd.add("bbb");
        cd.add("ccc");
        cd.add("ddd");
        System.out.println(cd);
//        3. Create a priority queue of integers and add elements to it.
        System.out.println("PriorityQueue<Integer>");
        PriorityQueue<Integer> pqInt = new PriorityQueue<>();
        pqInt.add(32);
        pqInt.add(15);
        pqInt.add(26);
        System.out.println(pqInt);
//        4. Create a priority queue of strings and add elements to it
        System.out.println("PriorityQueue<String>");
        PriorityQueue<String> pqString = new PriorityQueue<>();
        pqString.add("a");
        pqString.add("b");
        pqString.add("c");
        System.out.println(pqString);
        Deque<Integer> arrDeque = new ArrayDeque<>();
        arrDeque.add(10);
        arrDeque.add(20);
        arrDeque.add(15);
        System.out.println(arrDeque);
//       7.  Remove elements from a queue until it is empty.
        System.out.println("Remove elements from a queue until it is empty.");
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(1,8,7,12,3));
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println("Deleting element "+queue.remove());
        }
//        8. Remove elements from a deque until it is empty.
        System.out.println("Remove elements from a deque until it is empty.");
        Deque<Integer> deque=new LinkedList<>(Arrays.asList(21,-8,9,12,3));
        System.out.println(deque);
        while (!deque.isEmpty()){
            System.out.println("Deleting element "+deque.remove());
        }
        deque=new LinkedList<>(Arrays.asList(21,-8,9,12,3));
//        9. Check if an element is present in a queue.
        System.out.println(queue.contains(8));
//        10. Check if an element is present in a deque.
        System.out.println(deque.contains(-8));
    }
}
