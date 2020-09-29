package tddvoorbeeld;

public class NegativeNumberException extends RuntimeException {

    public NegativeNumberException(String s){
        super(s + " is/are negative numbers, not allowed.");
    }
}
