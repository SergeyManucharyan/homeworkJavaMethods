package queue_deque.excercis_eeleven;

import java.util.LinkedList;
import java.util.Queue;
//11.Using the Queue<T> class write a program to print
// its first 50 members for given N
public class FirstFifty {
    public static void main(String[] args) {
        Queue<Integer> fifty=new LinkedList<>();
        for(int i=1;i<120;i+=2){
            fifty.add(i);
        }
        System.out.println(fifty);
        int counter=0;
        while (counter<50&&!fifty.isEmpty()){
            System.out.print(fifty.poll()+" ");
            counter++;

        }
    }
}
