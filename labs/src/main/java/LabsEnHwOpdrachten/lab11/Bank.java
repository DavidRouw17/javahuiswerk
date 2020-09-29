package LabsEnHwOpdrachten.lab11;

import java.util.HashMap;

public class Bank {
    private int accAmt;
    private HashMap<Integer, BankAccount> accMap;

    public Bank(){
        accAmt = 0;
        accMap = new HashMap<Integer, BankAccount>();
    }

    public void addCheckingAccount(){
        accAmt++;
        BankAccount acc = new CheckingAccount(accAmt);
        accMap.put(accAmt, acc);
    }

    public void addCheckingAccount(long balance){
        accAmt++;
        BankAccount acc = new CheckingAccount(accAmt, balance);
        accMap.put(accAmt, acc);
    }

    public void addSavingsAccount(double interestRate){
        accAmt++;
        BankAccount acc = new SavingsAccount(accAmt, interestRate);
        accMap.put(accAmt, acc);
    }

    public void addSavingsAccount(double interestRate, long balance){
        accAmt++;
        BankAccount acc = new SavingsAccount(accAmt, balance, interestRate);
        accMap.put(accAmt, acc);
    }

    public BankAccount getAccount(int accNum){
        return accMap.get(accNum);
    }

    public int bankSize(){
        return accMap.size();
    }

    public void printAccounts(){
        for (int accNum : accMap.keySet()){
            System.out.println(accMap.get(accNum));
        }
    }
}
