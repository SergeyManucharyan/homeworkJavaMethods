package arraylist_linkedlist.generic;

import java.util.ArrayList;

/**
 * Write a generic method, using a generic type parameter <T>, that replaces every
 * occurrence in an ArrayList<T> of a specified item with a specified replacement
 * item. The list and the two items are parameters to the method. Both items are of
 * type T.
 *
 * @param <T>
 */
public class GenericMethod<T> {
    ArrayList<T> replace(ArrayList<T> list, T elToReplace, T el) {
        for (T e : list) {
            if (e.equals(elToReplace)) {
                list.set(list.indexOf(e), el);
            }
        }
        return list;
    }
}
