package LabsEnHwOpdrachten.lab11;

class SavingsAccount extends BankAccount {

    private double interestRate;

    SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    SavingsAccount(int accountNumber, long balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }


    @Override
    public String toString() {
        return "This is a savingsaccount with accountNumber: " + accountNumber + " balance: " + balance +
                " interest rate: " + interestRate;
    }
}
