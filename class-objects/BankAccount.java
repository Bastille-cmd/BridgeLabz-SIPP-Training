public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Bob", "123456789", 1000);
        b.deposit(500);
        b.withdraw(300);
        b.displayBalance();
    }
}