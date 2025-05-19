
import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 100000.0;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created for: " + accountHolderName);
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited ₹ " + amount);
            System.out.println("Deposited successfully ₹ " + amount);
        } else {
            System.out.println("You don't have enough money to deposit");
        }
    }

    public void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn ₹ " + amount);
            System.out.println("Withdrawn successfully ₹ " + amount);
        } else {
            System.out.println("You don't have enough money to withdraw");
        }
    }

    public void ShowBalance() {
        System.out.println("\nCurrent Balance: " + balance);
    }

    public void ShowTransactionHistory() {
        System.out.println("\nTransaction History: ");
        for (String transaction : transactionHistory) {
            System.out.println("- " + transaction);
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Banking System!");
        System.out.print("Enter your account holder name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter your account number: ");
        String accountNumber = sc.nextLine();

        BankAccount bankAccount = new BankAccount(accountHolderName, accountNumber);

        int choice;
        do {
            System.out.println("\nWelcome to the Banking System!");
            System.out.println("Here is your options:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show balance");
            System.out.println("4. Show transaction history");
            System.out.println("5. Exit");

            System.out.print("Please enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        double deposit = Double.parseDouble(sc.nextLine());
                        bankAccount.Deposit(deposit);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw = Double.parseDouble(sc.nextLine());
                        bankAccount.Withdraw(withdraw);
                        break;
                    case 3:
                        bankAccount.ShowBalance();
                        break;
                    case 4:
                        bankAccount.ShowTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using Banking System!");
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                choice = 0;
            }

        } while (choice != 5);

        sc.close();

    }
}
