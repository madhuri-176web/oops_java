
package javapracticals;

class BankAccount {

    // Private data members
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setAccountHolder(String holder) {
        if (holder != null && !holder.trim().isEmpty()) {
            accountHolder = holder;
        } else {
            System.out.println("Invalid account holder name");
        }
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    // Display account details
    public void display() {

        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
}

public class Practical10 {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Madhuri", "123456789", 5000);

        System.out.println("Initial Account Details:");
        account.display();

        System.out.println("\nValid Transactions:");

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("\nInvalid Transactions:");

        account.deposit(-500);
        account.withdraw(-200);
        account.withdraw(10000);
        account.deposit(0);

        System.out.println("\nUpdated Account Details:");
        account.display();
    }
}
