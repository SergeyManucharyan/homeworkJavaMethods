package arraylist_linkedlist.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods<T> {
    /**
     *  iterate through all elements in a linked list
     * @param list
     */
    void likedListIterator(LinkedList<T> list) {
        for (T el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /**
     * iterate a linked list in reverse order
     * @param list
     */
    void linkedListReverseIteration(LinkedList<T> list) {
        for (int i = list.size() - 1; i > -1; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    /**
     *  insert elements into the linked list at the first and last
     * position
     * @param list
     * @param first
     * @param last
     * @return
     */
    LinkedList<T> addFirstAddLast(LinkedList<T> list, T first, T last) {
        list.set(0, first);
        list.set(list.size() - 1, last);
        return list;
    }

    /**
     *  insert the specified element at the end of a linked lis
     * @param list
     * @param el
     * @return
     */
    LinkedList<T> insertElementInEnd(LinkedList<T> list, T el) {
        T specified = null;
        for (T e : list) {
            if (e == el) {
                specified = e;
            }
        }
        if (specified != null) {
            list.addLast(specified);
            list.remove(specified);
        }
        return list;
    }

    /**
     *  remove first and last element from a linked list.
     * @param list
     */
    void removeFirstAndLast(LinkedList<T> list) {
        list.removeFirst();
        list.removeLast();
    }

    /**
     *  clone an linked list to another linked list
     * @param list
     * @return
     */
    LinkedList<T> cloneList(LinkedList<T> list) {
        LinkedList<T> cloned = new LinkedList<>();
        cloned = (LinkedList) list.clone();
        return cloned;
    }

    /**
     * test an linked list is empty or not
     * @param list
     * @return
     */
    boolean isEmpty(LinkedList<T> list) {
        return list.size() == 0;
    }

}
