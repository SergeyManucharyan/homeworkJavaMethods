package arraylist_linkedlist.customarraylist;

import java.util.*;

public class CustomArrayList<T> implements List<T> {
    private Object[] arrays = new Object[0];
    Object[] newArray = new Object[arrays.length];

    @Override
    public int size() {
        return newArray.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void replace(T t, T t1) {
        if (contains(t)) {
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].equals(t)) {
                    arrays[i] = t1;
                }
            }
        }
    }

    @Override
    public Iterator<T> iterator() {

        return new MyListIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        newArray = new Object[size() + 1];

        for (int i = 0; i < arrays.length; i++) {
            newArray[i] = arrays[i];
        }
        newArray[newArray.length - 1] = t;
        arrays = newArray;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int index = 0;
        if (contains(o)) {
            if (arrays.length == 1) {
                arrays = new Object[0];
                return false;
            }
            newArray = new Object[arrays.length - 1];
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].equals(o)) {
                    index = i;
                    break;
                } else {
                    newArray[i] = arrays[i];
                }
            }
            if (index < newArray.length - 1) {
                for (int i = index; i < newArray.length; i++) {
                    newArray[i] = arrays[i + 1];
                }
            }
        }
        arrays = newArray;
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        arrays = new Object[0];
        newArray = arrays;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public class MyListIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index != size();
        }

        @Override
        public T next() {
            return (T) newArray[index++];

        }
    }
}
