package cova.datastructures.linkedlists.doublylinkedlist;

import cova.datastructures.linkedlists.linkedlist.Node;

public class DoublyLinkedList<E> implements IDoublyLinkedList<E>{

    private DoubleEdgeNode<E> head;
    private DoubleEdgeNode<E> tail;

    public DoublyLinkedList() {

        DoubleEdgeNode<E> head = new DoubleEdgeNode<>(null);
        DoubleEdgeNode<E> tail = new DoubleEdgeNode<>(null);

        head.next = tail;
        tail.prev = head;

        this.head = null;
        this.tail = null;
    }
    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }
        int size = 0;
        DoubleEdgeNode<E> current = head.next;
        while(current != tail){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == tail;
    }

    @Override
    public E first() {
        return head.next.data;
    }

    @Override
    public E last() {
        return tail.prev.data;
    }

    @Override
    public void addFirst(E e) {
        DoubleEdgeNode<E> newNode = new DoubleEdgeNode<>(e);
        if(isEmpty()){
            head.next = newNode;
            tail.prev = newNode;
            newNode.next = tail;
            newNode.prev = head;
            return;
        }
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    @Override
    public void addLast(E e) {
        if (isEmpty()) {
            addFirst(e);
            return;
        }
        DoubleEdgeNode<E> newNode = new DoubleEdgeNode<>(e);
        newNode.next = tail;
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    @Override
    public void removeFirst() {
        head.next = head.next.next;
        head.next.prev = head;
    }

    @Override
    public void removeLast() {
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
    }

    public void printList() {
        DoubleEdgeNode<E> current = head.next;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
