package cova.datastructures.queues.linkedlistqueue;

public class LinkedListQueue<E> implements IQueue<E> {
    Node<E> head;
    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int size = 0;
        Node <E> current = head;

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
    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            System.out.println("The queue is empty");
            return null;
        }
        Node<E> current = head;
        head = current.next;
        return current.data;
    }

    @Override
    public E first() {
        if(isEmpty()){
            System.out.println("The queue is empty");
            return null;
        }
        return head.data;
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }

        Node<E> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
