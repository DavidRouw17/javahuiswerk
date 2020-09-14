package LabsEnHwOpdrachten.hw4;

public class EvenNumberException extends Exception {

    public EvenNumberException(int evenNumber){
        super(evenNumber + " is an even number, only odd numbers are accepted!");
    }
}
