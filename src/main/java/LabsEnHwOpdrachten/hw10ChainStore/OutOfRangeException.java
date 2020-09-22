package LabsEnHwOpdrachten.hw10ChainStore;

public class OutOfRangeException extends RuntimeException {

    public OutOfRangeException(int discount){
        super(discount + "% is not a valid discount percentage, only between 0 and 30%!");
    }
}
