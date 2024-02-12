package cova.datastructures.quicksort;

public class QuickSort {
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {

        //check for empty or null array
        if(lowIndex >= highIndex){
            return;
        }

        //Get the last element of the array as a pivot
        int pivot = arr[highIndex];

        //create left and right pointer, where lowIndex is 0 and highIndex is the last index
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //move the leftPointer to the right and the rightPointer to the left
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer, rightPointer);
        }

        //swap the pivot with the element at the leftPointer
        swap(arr, leftPointer, highIndex);

        //recursively sort the left and right subarrays
        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    //swap the elements at index1 and index2
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
