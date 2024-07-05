package bank_accounts_info;

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;
    private double fee;

    public SavingsAccount(double initialBalance, double withdrawalLimit, double fee) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
        this.fee = fee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds limit of $" + withdrawalLimit);
        } else if (amount + fee > balance) {
            System.out.println("Insufficient funds to cover the withdrawal and fee");
        } else {
            balance -= (amount + fee);
            System.out.println("Withdrawn: $" + amount + ", Fee: $" + fee);
        }
    }
}
