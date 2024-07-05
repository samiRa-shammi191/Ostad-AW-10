package bank_accounts_info;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000, 500, 2);
        BankAccount checking = new CheckingAccount(1000, 1);

        System.out.println("Initial Savings Account Balance: $" + savings.getBalance());
        savings.deposit(200);
        savings.withdraw(300);
        savings.withdraw(600);
        System.out.println("Final Savings Account Balance: $" + savings.getBalance());

        System.out.println("\nInitial Checking Account Balance: $" + checking.getBalance());
        checking.deposit(100);
        checking.withdraw(50);
        checking.withdraw(1200);
        System.out.println("Final Checking Account Balance: $" + checking.getBalance());
    }
}
