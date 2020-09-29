package LabsEnHwOpdrachten.hw7;

public class PersonDiedException extends RuntimeException {
    public PersonDiedException(int age){
        super("This person is now older then " + Person.MAX_AGE + ", so he/she's no longe alive.");
    }

}
