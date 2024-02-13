package cova.datastructures.bubblesort;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.mergesort.MergeSort;

import java.util.Scanner;

public class BubbleSortRunner implements IRunner {
    boolean isRunning = true;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {

        while (isRunning){

            System.out.println("BubleSort");
            System.out.println("Input the size of the array");
            System.out.println("But if you want to go back to the main menu, input 0");

            int size = scanner.nextInt();
            if (size == 0){
                isRunning = false;
                break;
            }

            System.out.println("Input the elements of the array");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            BubbleSort.bubbleSort(arr);

            System.out.println("Sorted array");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}
