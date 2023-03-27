package queue_deque.color;
import java.util.PriorityQueue;
//12.Write a Java program to create a new priority queue, add some colors (string)
//and print out the elements of the priority queue.
public class Color {
    public static void main(String[] args) {
        PriorityQueue<String> color = new PriorityQueue<>();
        color.add("white");
        color.add("black");
        color.add("yellow");
        color.add("pink");
        color.add("orange");
        while (!color.isEmpty()) {
            System.out.println(color.peek());
        }
        System.out.println(color.toString());
    }
}

