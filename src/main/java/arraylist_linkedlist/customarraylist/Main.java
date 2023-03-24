package arraylist_linkedlist.customarraylist;

import arraylist_linkedlist.customarraylist.CustomArrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> l = new CustomArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(37);
        l.remove((Integer) 2);
        for (Integer e : l) {
            System.out.println(e);
        }
        System.out.println(l.contains(1));
        System.out.println(l.contains(10));
        l.replace(37, 52);
        System.out.println(l.isEmpty());
        for (Integer e : l) {
            System.out.println(e);
        }

    }
}
