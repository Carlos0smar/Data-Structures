package cova.datastructures.linkedlists.linkedlist;

import cova.datastructures.linkedlists.linkedlist.ILinkedList;
import cova.datastructures.linkedlists.linkedlist.Node;

public class LinkedList implements ILinkedList {

    Node head;

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int size = 0;
        Node current = head;

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
    public Node first() {
        return head;
    }

    @Override
    public Node last() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(int data) {
        Node lastNode = last();

        if (lastNode == null) {
            head = new Node(data);
            return;
        }

        lastNode.next = new Node(data);


    }

    @Override
    public void removeFirst() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        head = current.next;
    }

    @Override
    public void removeLast() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node lastCurrent = head;
        while (current != null) {

            if (current.next == null) {
                lastCurrent.next = null;
                break;
            }
            lastCurrent = current;
            current = current.next;

        }
    }

    public void print() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
