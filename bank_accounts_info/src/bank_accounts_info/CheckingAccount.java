package bank_accounts_info;

class CheckingAccount extends BankAccount {
    private double fee;

    public CheckingAccount(double initialBalance, double fee) {
        super(initialBalance);
        this.fee = fee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount + fee > balance) {
            System.out.println("Insufficient funds to cover the withdrawal and fee");
        } else {
            balance -= (amount + fee);
            System.out.println("Withdrawn: $" + amount + ", Fee: $" + fee);
        }
    }
}
