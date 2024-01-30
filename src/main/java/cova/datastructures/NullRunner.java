package cova.datastructures;

import cova.datastructures.interfaces.IRunner;



public class NullRunner implements IRunner {

    @Override
    public void run() {
        System.out.println("Wrong number introduced or not implement yet");
    }

}
