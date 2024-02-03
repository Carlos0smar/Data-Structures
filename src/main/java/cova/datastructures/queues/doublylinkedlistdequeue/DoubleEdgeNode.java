package cova.datastructures.queues.doublylinkedlistdequeue;

public class DoubleEdgeNode<T> {
    T data;
    DoubleEdgeNode<T> prev;
    DoubleEdgeNode<T> next;

    public DoubleEdgeNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
