package LabsEnHwOpdrachten.lab11;

abstract class BankAccount {
    protected long accountNumber;
    protected long balance;

    protected BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    protected BankAccount(long accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(long amount) {
        this.balance -= amount;
    }


    void deposit(long amount) {
        this.balance += amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }


    public long getBalance() {
        return balance;
    }


    public abstract String toString();


}
