package LabsEnHwOpdrachten.lab11;

class CheckingAccount extends BankAccount {

    CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    CheckingAccount(int accountNumber, long balance) {
        super(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "This is a checking account with accountNumber: " + accountNumber +
                " balance: " + balance;
    }
}
