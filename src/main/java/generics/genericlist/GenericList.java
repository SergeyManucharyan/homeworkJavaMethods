package generics.genericlist;

public class GenericList<T> {
    private int capacity;
    private int size = 0;
    private Object[] array;

    public GenericList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void add(T t) {
        array[size] = t;
        size++;
        if (capacity < size + 1) {
            grow();
        }
    }

    /**
     * grow array size when array is full
     */
    private void grow() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * get element by index
     *
     * @param index of element
     * @return element
     */
    public T get(int index) {
        try {
            if (index > -1 && index < size) {
                return (T) array[index];
            } else throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Incorrect index");
        }
        return null;
    }

    /**
     * remove element by index
     *
     * @param index of the element to be removed
     */
    public void remove(int index) {
        try {
            if (index > -1 && index < size) {
                size--;
                Object[] newArray = new Object[capacity];
                for (int i = 0; i < size; i++) {
                    if (i < index) {
                        newArray[i] = array[i];
                    } else {
                        newArray[i] = array[i + 1];
                    }
                }
                array = newArray;
            } else throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Incorrect index");
        }
    }

    /**
     * inserting
     * element at given position
     *
     * @param index for element
     * @param el    element to insert
     */
    public void insert(int index, T el) {
        try {
            if (index > -1 && index < size + 1) {
                if (capacity < size + 1) {
                    grow();
                }
                Object[] newArray = new Object[capacity];
                size++;
                newArray[index] = el;
                for (int i = 0; i < size; i++) {
                    if (i < index) {
                        newArray[i] = array[i];
                    }
                    if (i > index) {
                        newArray[i] = array[i - 1];
                    }
                }
                array = newArray;
            } else throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Incorrect index");
        }
    }

    /**
     * finding element by its value
     *
     * @param el element to find
     * @return index of element or -1 if element not found
     */
    public int indexOf(T el) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(el)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (size >= 1) {
            sb.append(array[0]);
        }
        for (int i = 1; i < size - 1; i++) {
            sb.append(",");
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
