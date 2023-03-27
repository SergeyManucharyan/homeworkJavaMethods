package queue_deque;

import arraylist_linkedlist.customarraylist.CustomArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomDeque<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    public CustomDeque() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(T t){
        Node<T> node=new Node<>(t);
        if(isEmpty()){
            head=tail=node;
        }else {
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }
    public void addLast(T t){
        Node<T> node =new Node<>(t);
        if(isEmpty()){
            head=tail=node;
        }else{
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
    }
    public boolean isEmpty(){
        return size==0;
    }

    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder dequeToString=new StringBuilder();
        Node<T> current=head;
        dequeToString.append("[");
        while (current!=null){
            dequeToString.append(current.data);
            dequeToString.append(current.next==null?"":",");
            current=current.next;
        }
        dequeToString.append("]");
        return dequeToString.toString();
    }
}