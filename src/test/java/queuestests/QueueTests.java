package queuestests;

import cova.datastructures.queues.linkedlistqueue.IQueue;
import cova.datastructures.queues.linkedlistqueue.LinkedListQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTests {
    // Testing the size method

    // Empty queue
    @Test
    public void onInitSizeIsZero() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        Assertions.assertEquals(0, queue.size());
    }

    // Queue with one element
    @Test
    public void onAddFirstElementIsOne() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        Assertions.assertEquals(1, queue.size());

    }

    // Queue with a deleted element
    @Test
    public void onRemoveFirstSizeIsZero() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.dequeue();
        Assertions.assertEquals(0, queue.size());
    }

    // Testing if the queue is empty

    // Queue with no elements
    @Test
    public void onInitFirstElement() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        Assertions.assertTrue(queue.isEmpty());
    }

    //Queue with one element
    @Test
    public void onAddAnElementIsNotEmpty() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        Assertions.assertFalse(queue.isEmpty());
    }

    //Queue with a deleted element
    @Test
    public void onRemoveAnElementIsEmpty() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.dequeue();
        Assertions.assertTrue(queue.isEmpty());
    }

    // Testing first element in the queue
    // Queue with one first element
    @Test
    public void onEnqueueFirstIsOne() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        Assertions.assertEquals(1, queue.first());
    }

    //Queue with two elements, first element must be one
    @Test
    public void onEnqueueSecondElement() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        Assertions.assertEquals(1, queue.first());
    }

    // Testing dequeue method
    // Queue with one element
    @Test
    public void onDequeueFirstIsOne() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        Assertions.assertEquals(1, queue.dequeue());
    }

    // Queue with Two elements, must returns one
    @Test
    public void onDequeueReturnsFistElement() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        Assertions.assertEquals(1, queue.dequeue());
    }

    // Empty queue
    @Test
    public void onDequeueEmptyQueue() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        Assertions.assertNull(queue.dequeue());
    }

}
