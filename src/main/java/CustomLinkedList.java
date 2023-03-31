import java.util.*;

public class CustomLinkedList<E> implements List {
    private int size = 0;
    private CustomLinkedList.Node<E> first;
    private CustomLinkedList.Node<E> last;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        CustomLinkedList.Node<E> newNode = new CustomLinkedList.Node<>();
        newNode.prev = last;
        newNode.item = (E) o;
        newNode.next = null;
        size++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private static class Node<E> {
        E item;
        CustomLinkedList.Node<E> next;
        CustomLinkedList.Node<E> prev;

        Node(CustomLinkedList.Node<E> prev, E element, CustomLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        public Node() {

        }
    }

    class CustomIterator implements Iterator<E> {
        Node<E> current = null;

        @Override
        public boolean hasNext() {
            if (current == null && first != null) {
                return true;
            } else if (current != null) {
                return current.next != null;
            }
            return false;

        }

        @Override
        public E next() {
            if (current == null && first != null) {
                current = first;
                return (E)first.item;
            } else if (current != null) {
                current = current.next;
                return (E)current.item;
            }
            return null;
        }
    }
}
