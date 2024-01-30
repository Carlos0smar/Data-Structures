package cova.datastructures.linkedlists.linkedlist;

public interface ILinkedList {
    int size();
    boolean isEmpty();
    Node first();
    Node last();
    void addFirst(int data);
    void addLast(int data);
    void removeFirst();
    void removeLast();
}
