package cova.datastructures;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.linkedlists.GeneralLinkedListsRunner;
import cova.datastructures.linkedlists.linkedlist.LinkedListRunner;
import cova.datastructures.queues.DoublyLinkedLIstDequeueRunner;
import cova.datastructures.stacks.LinkedListStackRunner;

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
                return new DoublyLinkedLIstDequeueRunner();
            case 4:
                //TODO
                return new NullRunner();
            case 5:
                //TODO
                return new NullRunner();
            case 6:
                //TODO
                return new NullRunner();
            case 7:
                //TODO
                return new NullRunner();
            case 8:
                //TODO
                return new NullRunner();
            default:
                return new NullRunner();
        }

    }

}
