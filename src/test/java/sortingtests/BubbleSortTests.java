package sortingtests;

import cova.datastructures.bubblesort.BubbleSort;
import cova.datastructures.mergesort.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {
    @Test
    public void testBubbleSortThreeElements() {

        int[] arr = {0, 2, 1};
        int[] expectedArr = {0,1,2};
        BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testBubbleSortSixElements() {

        int[] arr = {3,6,1,2,4,5};
        int[] expectedArr = {1,2,3,4,5,6};
        BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testBubbleSortOneElement(){

        int[] arr = {1};
        BubbleSort.bubbleSort(arr);
        Assertions.assertEquals(1, arr[0]);
    }

    @Test
    public void testBubbleSortRandomElements() {

        int[] arr = {3,6,1,2,4,5, 9, 8, 7, 0};
        int[] expectedArr = {0,1,2,3,4,5,6,7,8,9};
        BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(expectedArr, arr);

    }
}
