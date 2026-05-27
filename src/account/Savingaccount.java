package account;

public class Savingaccount extends Account {

    // Constructor
    public Savingaccount(int accountNumber, double balance) {

        // Calling Parent Constructor
        super(accountNumber, balance);
    }

    // Method Overriding
    @Override
    public void withdraw(double amount) {

        // Minimum balance should be 50
        if (balance - amount >= 50) {

            balance = balance - amount;

            System.out.println(amount + " Withdrawn Successfully");
            System.out.println("Remaining Balance : " + balance);

        } else {

            System.out.println("Minimum Balance of 50 Required");
        }
    }
}