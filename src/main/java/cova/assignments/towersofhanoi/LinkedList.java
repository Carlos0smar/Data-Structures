package cova.assignments.towersofhanoi;

public class LinkedList<E> implements IList<E>{
    Node<E> head;
    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int size = 0;
        Node<E> current = head;

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
    public void push(E o) {
        Node<E> newNode = new Node<>(o);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    @Override
    public E top() {
        return head.data;
    }

    @Override
    public E pop() {
        Node<E> current = head;
        Node<E>lastCurrent = head;
        head = current.next;
        return lastCurrent.data;
    }

    public void printRode(){
        Node<E> current = head;
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
