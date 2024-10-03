import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double checkBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance for this withdrawal.");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            return false;
        }
    }
}
class ATM {
    private BankAccount acc;
    public ATM(BankAccount acc) {
        this.acc = acc;
    }
    public void displayMenu() {
        System.out.println(" Welcome ");
        System.out.println("1. Withdraw amount");
        System.out.println("2. Deposit amount");
        System.out.println("3. Check Balance");
        
       
    }
    public void performAction(int choice) {
        Scanner in = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Current Balance: $" + acc.checkBalance());
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = in.nextDouble();
                acc.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = in.nextDouble();
                acc.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    public void startATM() {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            System.out.print("Please choose an option: ");
            choice = in.nextInt();
            performAction(choice);
        } while (choice != 3); 
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100000.00);
        ATM atm = new ATM(acc);
        atm.startATM();
    }
}