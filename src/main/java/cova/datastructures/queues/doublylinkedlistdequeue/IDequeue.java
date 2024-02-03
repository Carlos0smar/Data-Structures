package cova.datastructures.queues.doublylinkedlistdequeue;

public interface IDequeue <E> {
    int size();
    boolean isEmpty();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
    E first();
    E last();
}
