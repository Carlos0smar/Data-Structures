package cova.datastructures.linkedlists.doublylinkedlist;

public interface IDoublyLinkedList<E> {
    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst(E e);
    void addLast(E e);
    void removeFirst();
    void removeLast();

}
