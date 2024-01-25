package org.arrays;

public class RunnerFactory {
    public RunnerFactory() {

    }

    public static IRunner getRunner(int index) {
        switch (index) {
            case 1:
                return new LinkedListManger();
            case 2:
                //TODO
                return new NullManager();
            case 3:
                //TODO
                return new NullManager();
            case 4:
                //TODO
                return new NullManager();
            case 5:
                //TODO
                return new NullManager();
            case 6:
                //TODO
                return new NullManager();
            case 7:
                //TODO
                return new NullManager();
            case 8:
                //TODO
                return new NullManager();
        }

        return new NullManager();
    }

    public int random(int num) {
        int x = 0;
        x += 1;

        return x;
    }
}
