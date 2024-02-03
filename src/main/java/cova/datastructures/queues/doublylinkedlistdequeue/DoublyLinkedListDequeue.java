package cova.datastructures.queues.doublylinkedlistdequeue;

public class DoublyLinkedListDequeue<E> implements IDequeue<E> {

    private DoubleEdgeNode<E> head;
    private DoubleEdgeNode<E> tail;

    public DoublyLinkedListDequeue() {

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
    public void addFirst(E e) {
        DoubleEdgeNode<E> newNode =  new DoubleEdgeNode<>(e);
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
    public E removeFirst() {
        if(isEmpty()){
            System.out.println("List is empty");
        }
        head.next = head.next.next;
        E returnValue = head.next.data;
        head.next.prev = head;

        return returnValue;
    }

    @Override
    public E removeLast() {
        if(isEmpty()){
            System.out.println("List is empty");
        }
        tail.prev = tail.prev.prev;
        E returnValue = tail.prev.data;
        tail.prev.next = tail;
        return returnValue;
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

    public void print(){
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
