package LabsEnHwOpdrachten.lab7;

import java.math.BigDecimal;

public class NegativeBalanceException extends Exception {

    public NegativeBalanceException(BigDecimal balance){
        super("Action not allowed, negative balance not permitted and would be " + balance);
    }
}
