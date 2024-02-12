package sortingtests;

import cova.datastructures.quicksort.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTests {
    @Test
    public void testQuickSortThreeElements() {

        int[] arr = {0, 2, 1};
        int[] expectedArr = {0,1,2};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testQuickSortSixElements() {

        int[] arr = {3,6,1,2,4,5};
        int[] expectedArr = {1,2,3,4,5,6};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testQuickSortOneElement(){

        int[] arr = {1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertEquals(1, arr[0]);
    }

    @Test
    public void testQuickSortRandomElements() {

        int[] arr = {3,6,1,2,4,5, 9, 8, 7, 0};
        int[] expectedArr = {0,1,2,3,4,5,6,7,8,9};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(expectedArr, arr);

    }
}
