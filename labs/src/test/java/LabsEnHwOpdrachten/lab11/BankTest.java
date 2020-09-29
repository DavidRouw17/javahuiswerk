package LabsEnHwOpdrachten.lab11;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void testIfAddingAccountWorks() {
        bank.addCheckingAccount();
        //bank.printAccounts();

        assertEquals(bank.bankSize(), 5);
    }

    @Test
    public void testIfAddingMoneyWorks() {
        bank.getAccount(4).deposit(250);

        assertEquals(550, bank.getAccount(4).getBalance());
    }

    @Test
    public void testIfWithdrawingMoneyWorks() {
        bank.getAccount(2).withdraw(137);
        assertEquals(163, bank.getAccount(2).getBalance());
        bank.printAccounts();
    }
}