package arraylist_linkedlist.arraylist;

import java.util.ArrayList;


public class ArrayListMethods<T> {
    /**
     * this method iterate through all elements in an array list
     *
     * @param list
     */
    void arrayListIteration(ArrayList<T> list) {
        for (Object el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /**
     * this method is insert element into arraylist in first position
     *
     * @param list
     * @param el
     * @return
     */
    ArrayList<T> insertInFirstPosition(ArrayList<T> list, T el) {
        list.add(0, el);
        return list;
    }

    /**
     * this method is  update specific array element by given element
     *
     * @param list
     * @param elToUpdate
     * @param el
     * @return
     */
    ArrayList<T> updateElement(ArrayList<T> list, T elToUpdate, T el) {
        for (T e : list) {
            if (e == elToUpdate) {
                list.set(list.indexOf(e), el);
            }
        }
        return list;
    }

    /**
     * this method is searches an element in aa array list.
     *
     * @param list
     * @param el
     */
    void searchElement(ArrayList<T> list, T el) {
        for (T i : list) {
            if (i == el) {
                System.out.println(el + " is at index " + list.indexOf(i));
                return;
            }
        }
        System.out.println("The list not contain this element");
    }

    /**
     * this method is  copy one array list into another
     *
     * @param list
     * @return
     */
    ArrayList<T> copyList(ArrayList<T> list) {
        ArrayList<T> copy = new ArrayList<>(list);
        return copy;
    }

    /**
     * this method is reverse element in arraylist
     *
     * @param list
     * @return
     */
    ArrayList<T> reverseList(ArrayList<T> list) {
        ArrayList<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i > -1; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    /**
     * this method is  swap two elements in an array list
     *
     * @param list
     * @param elOne
     * @param elTwo
     * @return
     */
    ArrayList<T> swapElement(ArrayList<T> list, T elOne, T elTwo) {
        int indexOfFirstElement = list.indexOf(elOne);
        int indexOfSecondElement = list.indexOf(elTwo);
        T temp = list.get(indexOfFirstElement);
        list.set(indexOfFirstElement, list.get(indexOfSecondElement));
        list.set(indexOfSecondElement, temp);
        return list;
    }

    /**
     * this method is checks empty or not
     *
     * @param list
     * @return
     */
    boolean isEmpty(ArrayList<T> list) {
        return list.size() == 0;
    }

    /**
     * this method is increase arraylist capacity
     *
     * @param list
     * @param newCapacity
     */
    void increaseCapacity(ArrayList<T> list, int newCapacity) {
        list.ensureCapacity(newCapacity);
    }
}
