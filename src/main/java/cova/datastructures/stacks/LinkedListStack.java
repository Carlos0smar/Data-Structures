package cova.datastructures.stacks;
import cova.datastructures.stacks.Node;

public class LinkedListStack<T> implements IStack<T>{
    private Node<T> head;
    @Override
    public int size() {
        if(isEmpty()) {
            return 0;
        }
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(T e) {
        Node <T> newNode = new Node<>(e);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    public T top() {
        if(isEmpty()){
            return null;
        }
        return head.data;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("The Stack is empty");
            return null;
        }
        Node<T> current = head;
        Node<T> lastCurrent = head;
        head = current.next;
        return lastCurrent.data;
    }

    public void print(){
        Node<T> current = head;
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
