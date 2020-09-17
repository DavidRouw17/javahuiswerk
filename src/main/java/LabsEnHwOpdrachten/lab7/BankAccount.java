package LabsEnHwOpdrachten.lab7;

import java.math.BigDecimal;

public class BankAccount {
    private int accNumber;
    private BigDecimal balance;
    private double interest;

    public static final int MINIMAL_AMT = 0;

    public BankAccount(int accNum) {
        this.balance = new BigDecimal(0);
        this.accNumber = accNum;
        this.interest = 0.05;
    }

    public BankAccount(int accNum, double balance) {
        BigDecimal b = new BigDecimal(balance);
        negBalanceChecker(b);

        this.balance = b;
        this.accNumber = accNum;
        this.interest = 0.05;
    }

    private void negBalanceChecker(BigDecimal balance) {
        if (balance.doubleValue() < MINIMAL_AMT) {
            throw new NegativeBalanceException(balance);
        }
    }

    public void deposit(double addedMoney) {
        try {
            BigDecimal b = new BigDecimal(addedMoney);
            BigDecimal result = balance.add(b);
            negBalanceChecker(result);
            this.balance = result;
        }
        catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(double retrievedMoney) {
        try {
            BigDecimal b = new BigDecimal(retrievedMoney);
            BigDecimal result = balance.subtract(b);
            negBalanceChecker(result);
            this.balance = result;
        }
        catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }
    }

    public void transferTo(BankAccount otherAcc, double amt) {
        try {
            this.withdraw(amt);
            otherAcc.deposit(amt);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }

    }

    public void transferFrom(BankAccount otherAcc, double amt) {
        try {
            otherAcc.withdraw(amt);
            this.deposit(amt);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public BigDecimal yearInterest() {
        BigDecimal interest = balance.multiply(new BigDecimal(this.interest));
        return interest.setScale(2, BigDecimal.ROUND_DOWN);

    }

    /*
    Getters and setters from here
     */
    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, BigDecimal.ROUND_DOWN);
    }

    public void setBalance(BigDecimal balance) {
        negBalanceChecker(balance);
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String toString(){

        return ("Accountnumber is: " + accNumber + ", and there are "
                + balance.setScale(2, BigDecimal.ROUND_DOWN) + " ekkies on the account");
    }
}
