package cova.datastructures.linkedlists.doublylinkedlist;

public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
