import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class SimpleBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(100.00); // Start with $100

        System.out.println("Welcome to the Simple Banking System");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userAccount.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = scanner.nextDouble();
                    userAccount.deposit(depAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withAmount = scanner.nextDouble();
                    userAccount.withdraw(withAmount);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}