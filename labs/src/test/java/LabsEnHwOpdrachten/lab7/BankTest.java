package LabsEnHwOpdrachten.lab7;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BankTest {



    @Test
    public void testIfAddAccountWorks() {
        Bank b = new Bank(5);
        b.addAccount();

        int expectedSize = 6;

        assertEquals(expectedSize, b.getBankSize());
    }

    @Test
    public void testIfAddingMoneyWorks() {
        Bank b = new Bank();
        b.addAccount(500);
        b.addMoney(1, 100);

        BigDecimal expectedNewBalance = new BigDecimal(600);
        expectedNewBalance = expectedNewBalance.setScale(2, BigDecimal.ROUND_DOWN);

        assertEquals(expectedNewBalance, b.getBalance(1));

    }

    @Test
    public void testIfRetrievingMoneyWorks() {
        Bank b = new Bank();
        b.addAccount(500);
        b.retrieveMoney(1, 100);

        BigDecimal expectedNewBalance = new BigDecimal(400);
        expectedNewBalance = expectedNewBalance.setScale(2, BigDecimal.ROUND_DOWN);

        assertEquals(expectedNewBalance, b.getBalance(1));
    }

    @Test
    public void testIfBalanceCantGetUnder0WhileRetrieving(){
        Bank b = new Bank();
        b.addAccount(500);
        b.retrieveMoney(1, 600);

        BigDecimal expectedNewBalance = new BigDecimal(500);
        expectedNewBalance = expectedNewBalance.setScale(2, BigDecimal.ROUND_DOWN);

        assertEquals(expectedNewBalance, b.getBalance(1));
    }

    @Test
    public void testIfTransferringMoneyBetween2AccountsWorks() {
        Bank b = new Bank();
        b.addAccount(500);
        b.addAccount(200);
        b.transferMoney(2, 1, 100);

        BigDecimal expectedNewBalanceAccount1 = new BigDecimal(600);
        expectedNewBalanceAccount1 = expectedNewBalanceAccount1.setScale(2, BigDecimal.ROUND_DOWN);

        assertEquals(expectedNewBalanceAccount1, b.getBalance(1));

    }

    @Test
    public void testIfTransferringMoneyBetween2AccountsWorksWhenAccountFromHasToLittleMoney() {
        Bank b = new Bank();
        b.addAccount(500);
        b.addAccount(200);
        b.transferMoney(2, 1, 300);

        BigDecimal expectedNewBalanceAccount1 = new BigDecimal(500);
        expectedNewBalanceAccount1 = expectedNewBalanceAccount1.setScale(2, BigDecimal.ROUND_DOWN);

        assertEquals(expectedNewBalanceAccount1, b.getBalance(1));

    }

    @Test
    public void moneyInTheBank() {
        Bank b = new Bank();
        b.addAccount(500);
        b.addAccount(200);
        b.addAccount(300.14);
        BigDecimal money = b.moneyInTheBank();

        BigDecimal expectedResult = new BigDecimal(1000.14);
        expectedResult = expectedResult.setScale(2, BigDecimal.ROUND_DOWN);

        assertEquals(expectedResult, money);
    }
}