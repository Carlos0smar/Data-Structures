package cova.datastructures.linkedlists.doublylinkedlist;

public class DoublyLinkedList<E> implements IDoublyLinkedList<E>{

    private DoubleEdgeNode<E> head;
    private DoubleEdgeNode<E> tail;

    public DoublyLinkedList() {

        this.head = new DoubleEdgeNode<>(null);
        this.tail = new DoubleEdgeNode<>(null);

        this.head.next = this.tail;
        this.tail.prev = this.head;

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
        if(isEmpty()){
            System.out.println("List is empty");
        }
        return head.next.data;
    }

    @Override
    public E last() {
        if(isEmpty()){
            System.out.println("List is empty");
        }
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
        if(isEmpty()){
            System.out.println("List is empty");
        }
        head.next = head.next.next;
        head.next.prev = head;
    }

    @Override
    public void removeLast() {
        if(isEmpty()){
            System.out.println("List is empty");
        }
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
    }

    public void printList() {
        if(isEmpty()){
            System.out.println("List is empty");
        }
        DoubleEdgeNode<E> current = head.next;
        while (current.data != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
