package arraylist_linkedlist.generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericMethod<String> gm=new GenericMethod<>();
        ArrayList<String> list = new ArrayList<>();
        GenericMethod<Integer> gm1=new GenericMethod<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("f");
        list.add("g");
        list.add("b");
        list1.add(1);
        list1.add(2);
        list1.add(6);
        list1.add(1);
        list1.add(1);
        list1.add(9);
        gm1.replace(list1,1,5);
        for (Integer e:list1) {
            System.out.print(e+" ");
        }
        System.out.println();
        gm.replace(list,"b","x");
        for (String e:list) {
            System.out.print(e+" ");
        }
    }
}
