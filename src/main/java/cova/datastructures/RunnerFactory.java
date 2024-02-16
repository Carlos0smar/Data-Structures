package cova.datastructures;

import cova.datastructures.Graphs.GraphRunner;
import cova.datastructures.bubblesort.BubbleSortRunner;
import cova.datastructures.interfaces.IRunner;
import cova.datastructures.linkedlists.GeneralLinkedListsRunner;
import cova.datastructures.mergesort.MergeSortRunner;
import cova.datastructures.queues.GeneralLinkedListQueueRunner;
import cova.datastructures.queues.doublylinkedlistdequeue.DoublyLinkedLIstDequeueRunner;
import cova.datastructures.quicksort.QuickSortRunner;
import cova.datastructures.stacks.LinkedListStackRunner;
import cova.datastructures.trees.BinaryTree;
import cova.datastructures.trees.BinaryTreeRunner;

public class RunnerFactory {
    public RunnerFactory() {

    }

    public static IRunner getRunner(int index) {
        switch (index) {
            case 1:
                return new GeneralLinkedListsRunner();
            case 2:
                return new LinkedListStackRunner();
            case 3:
                return new GeneralLinkedListQueueRunner();
            case 4:
                return new BinaryTreeRunner();
            case 5:
                return new GraphRunner();
            case 6:
                return new MergeSortRunner();
            case 7:
                return new QuickSortRunner();
            case 8:
                return new BubbleSortRunner();
            default:
                return new NullRunner();
        }

    }

}
