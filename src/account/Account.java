package account;

public class Account {

    // Variables
    protected int accountNumber;
    protected double balance;

    // Constructor
    public Account(int accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println(amount + " Deposited Successfully");
            System.out.println("Current Balance : " + balance);

        } else {

            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdrawal Method
    public void withdraw(double amount) {

        if (amount > 0) {

            if (balance >= amount) {

                balance = balance - amount;

                System.out.println(amount + " Withdrawn Successfully");
                System.out.println("Remaining Balance : " + balance);

            } else {

                System.out.println("Insufficient Balance");
            }

        } else {

            System.out.println("Invalid Withdrawal Amount");
        }
    }

    // Display Method
    public void displayDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

	
}