package arraylist_linkedlist.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayListMethods<Integer> al = new ArrayListMethods<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("arrayListIteration");
        al.arrayListIteration(list);
        System.out.println("insertInFirstPosition");
        al.arrayListIteration(al.insertInFirstPosition(list, 0));
        System.out.println("updateElement");
        al.arrayListIteration(al.updateElement(list, 2, 9));
        System.out.println("searchElement");
        al.searchElement(list, 9);
        System.out.println("copyList");
        al.arrayListIteration(al.copyList(list));
        System.out.println("reverseList");
        al.arrayListIteration(al.reverseList(list));
        System.out.println("swapElement");
        al.arrayListIteration(al.swapElement(list, 9, 5));
        System.out.println("isEmpty");
        System.out.println(al.isEmpty(list));
        al.increaseCapacity(list, list.size() + 5);
    }
}
