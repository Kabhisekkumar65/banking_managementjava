package account;

public class Currentaccount extends Account {

    // Overdraft Limit
    private double overdraftLimit;

    // Constructor
    public Currentaccount(int accountNumber,
                          double balance,
                          double overdraftLimit) {

        // Calling Parent Constructor
        super(accountNumber, balance);

        this.overdraftLimit = overdraftLimit;
    }

    // Method Overriding
    @Override
    public void withdraw(double amount) {

        // Checking balance with overdraft
        if (balance + overdraftLimit >= amount) {

            balance = balance - amount;

            System.out.println(amount + " Withdrawn Successfully");
            System.out.println("Remaining Balance : " + balance);

        } else {

            System.out.println("Overdraft Limit Exceeded");
        }
    }

    // Display Details
    public void displayDetails() {

        System.out.println("Current Account");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}