package Lesson33.Throws;

class BankAccountSolution {
    private double balance;

    // constructor
    public BankAccountSolution(double balance) {
        this.balance = balance;
    }

    // getter
    public double getBalance() {
        return balance;
    }

    // deposit with error handling
    public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount must be positive!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw with error handling
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Not enough money!");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }
}

public class BankAccountTestSolution {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        // Test 1: Indsæt -100
        try {
            account.deposit(-100);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Hæv for meget
        try {
            account.withdraw(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Vis balance til sidst
        System.out.println("Final balance: " + account.getBalance());
    }
}