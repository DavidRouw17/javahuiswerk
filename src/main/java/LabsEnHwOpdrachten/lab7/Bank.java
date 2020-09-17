package LabsEnHwOpdrachten.lab7;

import java.math.BigDecimal;
import java.util.HashMap;

public class Bank {

    private int accAmt;
    private HashMap<Integer, BankAccount> accList;

    public Bank() {
        this(0);
    }

    public Bank(int newAccounts) {
        accList = new HashMap<Integer, BankAccount>();
        for (int i = 1; i <= newAccounts; i++) {
            BankAccount b = new BankAccount(i);
            accList.put(i, b);
            accAmt++;
        }
    }

    public void validAccountChecker(int accNumber) {
        if (accNumber < 1 || accNumber > accAmt) {
            throw new NoAccountFoundException(accNumber);
        }
    }

    public void addAccount() {
        accAmt++;
        BankAccount b = new BankAccount(accAmt);
        accList.put(accAmt, b);
        System.out.println("Account opened with accountnumber " + accAmt + ". You have no starting balance!");

    }

    public void addAccount(double balance) {
        accAmt++;
        BankAccount b = new BankAccount(accAmt, balance);
        accList.put(accAmt, b);
        System.out.println("Account opened with accountnumber " + accAmt
                + ". You have a starting balance of " + balance + " ekkies!");

    }

    public void addMoney(int accountNumber, double money) {
        try {
            validAccountChecker(accountNumber);
            accList.get(accountNumber).deposit(money);
        } catch (NoAccountFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public void retrieveMoney(int accountNumber, double money) {
        try {
            validAccountChecker(accountNumber);
            accList.get(accountNumber).withdraw(money);
        } catch (NoAccountFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void transferMoney(int accNumFrom, int accNumTo, double money) {
        try {
            validAccountChecker(accNumFrom);
            validAccountChecker(accNumTo);
            accList.get(accNumFrom).transferTo(accList.get(accNumTo), money);
        } catch (NoAccountFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printInfo(int accNumber) {
        try {
            validAccountChecker(accNumber);
            System.out.println(accList.get(accNumber));
        } catch (NoAccountFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public BigDecimal moneyInTheBank() {
        BigDecimal money = new BigDecimal(0);
        money.setScale(2, BigDecimal.ROUND_DOWN);
        for (int i : accList.keySet()) {
            money = money.add(accList.get(i).getBalance());
        }
        return money.setScale(2, BigDecimal.ROUND_DOWN);
    }

    public void moneyInTheBankPrinter() {
        System.out.println("The bank holds " + moneyInTheBank() + " ekkies!");
    }

    public void printAllAccounts() {
        for (int i : accList.keySet()) {
            System.out.println(accList.get(i));
        }
    }

    public void interestPrinter() {
        for (int i : accList.keySet()) {
            System.out.println("Account with number " + i + " gets " + accList.get(i).yearInterest() +
                    " interest after a year");
        }
    }

    public int getBankSize() {
        return accAmt;
    }

    public BigDecimal getBalance(int accNumber) {
        try {
            validAccountChecker(accNumber);
            return accList.get(accNumber).getBalance();
        } catch (NoAccountFoundException e) {
            System.out.println(e.getMessage());
            return new BigDecimal(0);
        }
    }
}
