package LabsEnHwOpdrachten.lab11;





import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;
    @BeforeEach
    public void setUp() {
        bank = new Bank();
        bank.addCheckingAccount(); //1
        bank.addCheckingAccount(300); //2
        bank.addSavingsAccount(0.5); //3
        bank.addSavingsAccount(1.5, 300); //4

    }

    @Test
    public void testIfAddingAccountWorks(){
        bank.addCheckingAccount();
        bank.printAccounts();


    }
}