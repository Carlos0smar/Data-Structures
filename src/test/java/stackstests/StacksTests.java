package stackstests;

import cova.datastructures.stacks.IStack;
import cova.datastructures.stacks.LinkedListStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StacksTests {

    // Testing the size method

    // Empty stack
    @Test
    public void onInitSizeIsZero() {
        IStack<Integer> stack = new LinkedListStack<>();
        Assertions.assertEquals(0, stack.size());
    }

    // Stack with one element
    @Test
    public void onPushSizeIsOne() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        Assertions.assertEquals(1, stack.size());
    }

    // Stack with one element removed
    @Test
    public void onPopSizeIsZero() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.pop();
        Assertions.assertEquals(0, stack.size());
    }

    // Testing if the stack is empty

    // Stack with no elements
    @Test
    public void onInitIsEmpty() {
        IStack<Integer> stack = new LinkedListStack<>();
        Assertions.assertTrue(stack.isEmpty());
    }

    // Stack with one element
    @Test
    public void onPushIsNotEmpty() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        Assertions.assertFalse(stack.isEmpty());
    }

    // Stack with one element removed
    @Test
    public void onPopIsEmpty() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    // Testing the top method

    // Stack with one element
    @Test
    public void onPushTopIsOne() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        Assertions.assertEquals(1, stack.top());
    }

    // Stack with one element removed
    @Test
    public void onPopTopIsNull() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.pop();
        Assertions.assertNull(stack.top());
    }

    // Testing the pop method

    // Stack with one element
    @Test
    public void onPushPopIsOne() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        Assertions.assertEquals(1, stack.pop());
    }

    // Stack with size of two and one element removed
    @Test
    public void onPopPopIsNull() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.pop());
    }

}
