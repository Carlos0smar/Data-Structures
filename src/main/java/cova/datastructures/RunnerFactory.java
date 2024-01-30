package cova.datastructures;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.linkedlists.linkedlist.LinkedListRunner;

public class RunnerFactory {
    public RunnerFactory() {

    }

    public static IRunner getRunner(int index) {
        switch (index) {
            case 1:
                return new LinkedListRunner();
            case 2:
                //TODO
                return new NullRunner();
            case 3:
                //TODO
                return new NullRunner();
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
        }

        return new NullRunner();
    }

}
