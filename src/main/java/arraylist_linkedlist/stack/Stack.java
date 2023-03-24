package arraylist_linkedlist.stack;

import java.util.ArrayList;

/**
 * Write a generic class Stack<T> that can be used to represent stacks of objects of
 * type T. The class should include methods push(), pop(), and isEmpty(). Inside the
 * class, use an ArrayList to hold the items on the stack
 *
 * @param <T>
 */
public class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    void push(T el) {
        this.list.add(el);
    }

    void pop() {
        if (this.isEmpty()) {
            return;
        }
        this.list.remove(list.size() - 1);
    }

    boolean isEmpty() {
        return this.list.size() == 0;
    }

    public ArrayList<T> getList() {
        return list;
    }
}
