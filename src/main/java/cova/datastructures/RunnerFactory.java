package cova.datastructures;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.linkedlists.GeneralLinkedListsRunner;
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
                //TODO
                return new NullRunner();
            case 6:
                //TODO
                return new NullRunner();
            case 7:
                return new QuickSortRunner();
            case 8:
                //TODO
                return new NullRunner();
            default:
                return new NullRunner();
        }

    }

}
