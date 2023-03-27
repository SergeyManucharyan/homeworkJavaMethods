package queue_deque.addanotherpriorityqueue;

import java.util.PriorityQueue;

public class AddAnother {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(15);
        PriorityQueue<Integer> newPriorityQueue= new PriorityQueue<>();
        newPriorityQueue.addAll(priorityQueue);
        System.out.println(newPriorityQueue);
    }
}
