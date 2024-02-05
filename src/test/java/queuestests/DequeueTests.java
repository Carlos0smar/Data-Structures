package queuestests;

import cova.datastructures.queues.doublylinkedlistdequeue.DoublyLinkedListDequeue;
import cova.datastructures.queues.doublylinkedlistdequeue.IDequeue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DequeueTests {
    // Testing the size of the dequeue

    // Empty dequeue
    @Test
    public void onInitSizeIsZero() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        Assertions.assertEquals(0, dequeue.size());
    }

    // Dequeue with one element
    @Test
    public void onAddFirstSizeIsOne() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        Assertions.assertEquals(1, dequeue.size());
    }

    // Dequeue with a deleted element
    @Test
    public void onRemoveFirstSizeIsZero() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        dequeue.removeFirst();
        Assertions.assertEquals(0, dequeue.size());
    }

    // Testing if the dequeue is empty

    // Dequeue with no elements
    @Test
    public void onInitIsEmpty() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        Assertions.assertTrue(dequeue.isEmpty());
    }

    // Dequeue with one element
    @Test
    public void onAddFirstIsNotEmpty() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        Assertions.assertFalse(dequeue.isEmpty());
    }

    // Dequeue with one element removed
    @Test
    public void onRemoveFirstIsEmpty() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        dequeue.removeFirst();
        Assertions.assertTrue(dequeue.isEmpty());
    }

    //Testing

    // Testing the first element of the dequeue

    // Dequeue with one element
    @Test
    public void onAddFirstFirstIsOne() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        Assertions.assertEquals(1, dequeue.first());
    }

    // Testing dequeue with no elements
    @Test
    public void onInitFirstIsNull() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        Assertions.assertNull(dequeue.first());
    }

    // Testing the last element of the dequeue

    // Dequeue with two elements
    @Test
    public void onAddFirstLastIsOne() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        dequeue.addLast(2);
        Assertions.assertEquals(2, dequeue.last());
    }

    // Testing the last element of the dequeue, whether the dequeue is empty
    @Test
    public void onLastElementOfEmptyDequeue() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        Assertions.assertNull(dequeue.last());
    }

    // Testing on removing the first element of the dequeue
    @Test
    public void onRemoveFirstFirstIsOne() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        Assertions.assertEquals(1, dequeue.removeFirst());
    }

    // Testing on removing the last element of the dequeue
    @Test
    public void onRemoveLastElementIsTwo() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        dequeue.addFirst(1);
        dequeue.addLast(2);
        Assertions.assertEquals(2, dequeue.removeLast());
    }

    // Testing on removing the first element of the dequeue, whether the dequeue is empty
    @Test
    public void onRemoveFirstElementOfEmptyDequeue() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        Assertions.assertNull(dequeue.removeFirst());
    }

    // Testing on removing the last element of the dequeue, whether the dequeue is empty
    @Test
    public void onRemoveLastElementOfEmptyDequeue() {
        IDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
        Assertions.assertNull(dequeue.removeLast());
    }

}
