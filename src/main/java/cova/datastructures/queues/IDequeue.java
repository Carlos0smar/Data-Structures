package cova.datastructures.queues;

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
