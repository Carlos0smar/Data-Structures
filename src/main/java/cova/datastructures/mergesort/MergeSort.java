package cova.datastructures.mergesort;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int inputLength = arr.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0 ; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge (int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftHalfLength = leftHalf.length;
        int rightHalfLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftHalfLength && j < rightHalfLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalfLength) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalfLength) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
