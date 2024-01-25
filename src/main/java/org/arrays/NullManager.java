package org.arrays;

public class NullManager implements IRunner {

    @Override
    public void run() {
        System.out.println("Wrong number introduced or not implement yet");
    }

    @Override
    public void printMenu() {
        System.out.println("Doesn't exist menu for this object");
    }
}
