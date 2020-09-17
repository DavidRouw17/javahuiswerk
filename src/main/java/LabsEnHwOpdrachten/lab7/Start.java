package LabsEnHwOpdrachten.lab7;

public class Start {

    public static void main(String[] args) {

        Bank bank = new Bank(2);
        bank.addAccount();
        bank.addAccount(500);
        bank.addMoney(2, 3453.43);
        bank.addMoney(1, 63453.43);
        //bank.printAllAccounts();
        bank.moneyInTheBankPrinter();
        bank.printInfo(4);
        bank.interestPrinter();

    }
}
