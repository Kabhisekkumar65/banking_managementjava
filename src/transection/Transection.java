package transection;

public class Transection {

    // Variables
    private int transactionId;
    private String transactionType;
    private double amount;

    // Constructor
    public Transection(int transactionId,
                       String transactionType,
                       double amount) {

        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    // Display Transaction Details
    public void displayTransaction() {

        System.out.println("Transaction ID   : " + transactionId);
        System.out.println("Transaction Type : " + transactionType);
        System.out.println("Amount           : " + amount);
    }
}