package arraylist_linkedlist.linkedlist;

import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedListMethods<String> lm=new LinkedListMethods<>();
        LinkedList<String> link=new LinkedList<>();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        lm.likedListIterator(link);
        lm.linkedListReverseIteration(link);
        lm.likedListIterator(lm.addFirstAddLast(link,"xxx","zzz"));
        lm.likedListIterator(lm.insertElementInEnd(link,"bbb"));
        lm.removeFirstAndLast(link);
        lm.likedListIterator(link);
        lm.likedListIterator(lm.cloneList(link));
        System.out.println(lm.isEmpty(link));

    }
}
