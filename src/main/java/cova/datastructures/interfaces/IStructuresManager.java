package cova.datastructures.interfaces;

import java.util.Random;

public interface IStructuresManager {
    /**
     * prints the menu implemented by the class
     */
    void printMenu();
    /**
     * a switch case that will call the methods of the class
     * @param optionSelected
     */
    void options(int optionSelected);

}
