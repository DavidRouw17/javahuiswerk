package LabsEnHwOpdrachten.lab7;

import LabsEnHwOpdrachten.hw7.Person;

public class Start {

    public static void main(String[] args) throws NegativeBalanceException {

        Bank bank = new Bank(2);
//        bank.addAccount();
//        bank.addAccount(500);
//        bank.addMoney(2, 3453.43);
//        bank.addMoney(1, 63453.43);
//        bank.printAllAccounts();
//        bank.moneyInTheBankPrinter();
//        bank.printInfo(4);
//        bank.interestPrinter();




        BankAccount acc = bank.getAccount(1);
        Person David = new Person("David", 24);
        acc.setOwnerOfAccount(David);
        System.out.println(acc.getOwnerOfAccount());
        System.out.println(acc.getOwnerOfAccount().getAge());
    }
}
