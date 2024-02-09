package cova.assignments.bubblesort;
import java.util.Scanner;
public class BubbleSort {


    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                System.out.println("Array after pass " + i + " and comparison " + j);
                for (int k = 0; k < arr.length; k++){
                    System.out.print(arr[k] + " ");
                }
                    System.out.println("");
            }
        }
        return arr;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = scanner.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array is: ");
        for (int k = 0; k < arr.length; k++){
            System.out.println(arr[k] + " ");
        }

        int[] sortedArr = bubbleSort(arr);

        System.out.println("The sorted array is: ");

        for (int i = 0; i < sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }
}
