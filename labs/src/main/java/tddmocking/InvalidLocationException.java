package tddmocking;

public class InvalidLocationException extends RuntimeException {

    public InvalidLocationException(){
        super("Locatie niet gevonden!");
    }

}
