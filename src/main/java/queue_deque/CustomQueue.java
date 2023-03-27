package queue_deque;

public class CustomQueue<T> {
    private Node<T> start;
    private Node<T> end;

    public void add(T t) {
        if (start == null) {
            end = new Node<>(t);
            start = end;
        } else {
            end.next = new Node<>(t);
            end = end.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder dequeToString = new StringBuilder();
        Node<T> current = start;
        dequeToString.append("[");
        while (current != null) {
            dequeToString.append(current.data);
            dequeToString.append(current.next == null ? "" : ",");
            current = current.next;
        }
        dequeToString.append("]");
        return dequeToString.toString();
    }

    public static class Node<T> {
        private Node<T> next;
        private T data;
        private int size = 0;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
