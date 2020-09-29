package LabsEnHwOpdrachten.lab7;

public class NoAccountFoundException extends RuntimeException {
    public NoAccountFoundException(int n){
        super("No account found with account number " + n);
    }
}
