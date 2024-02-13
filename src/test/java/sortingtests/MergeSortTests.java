package sortingtests;

import cova.datastructures.mergesort.MergeSort;
import cova.datastructures.quicksort.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTests {
    @Test
    public void testMergeSortThreeElements() {

        int[] arr = {0, 2, 1};
        int[] expectedArr = {0,1,2};
        MergeSort.mergeSort(arr);
        Assertions.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testMergeSortSixElements() {

        int[] arr = {3,6,1,2,4,5};
        int[] expectedArr = {1,2,3,4,5,6};
        MergeSort.mergeSort(arr);
        Assertions.assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testMergeSortOneElement(){

        int[] arr = {1};
        MergeSort.mergeSort(arr);
        Assertions.assertEquals(1, arr[0]);
    }

    @Test
    public void testMergeSortRandomElements() {

        int[] arr = {3,6,1,2,4,5, 9, 8, 7, 0};
        int[] expectedArr = {0,1,2,3,4,5,6,7,8,9};
        MergeSort.mergeSort(arr);
        Assertions.assertArrayEquals(expectedArr, arr);

    }
}
