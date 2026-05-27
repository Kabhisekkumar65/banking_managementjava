
package main;

import java.util.Scanner;

import bank.Bank;
import user.User;
import transection.Transection;
import account.Currentaccount;
import account.Savingaccount;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Bank Object
        Bank bank = new Bank();

        bank.welcome();

        System.out.println();

        // User Input
        System.out.print("Enter User ID : ");
        int userId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter User Name : ");
        String userName = sc.nextLine();

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        // User Object
        User user = new User(userId, userName, email);

        System.out.println();

        user.displayUser();

        int choice;

        do {

            System.out.println("\n===== Banking Menu =====");

            System.out.println("1. Saving Account");
            System.out.println("2. Current Account");
            System.out.println("3. Transaction");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                // Saving Account
                case 1:

                    System.out.println("\n===== Saving Account =====");

                    System.out.print("Enter Account Number : ");
                    int savingAccNo = sc.nextInt();

                    System.out.print("Enter Balance : ");
                    double savingBalance = sc.nextDouble();

                    Savingaccount saving =
                            new Savingaccount(savingAccNo,
                                               savingBalance);

                    System.out.print("Enter Deposit Amount : ");
                    double depositAmount = sc.nextDouble();

                    saving.deposit(depositAmount);

                    System.out.print("Enter Withdraw Amount : ");
                    double withdrawAmount = sc.nextDouble();

                    saving.withdraw(withdrawAmount);

                    break;

                // Current Account
                case 2:

                    System.out.println("\n===== Current Account =====");

                    System.out.print("Enter Account Number : ");
                    int currentAccNo = sc.nextInt();

                    System.out.print("Enter Balance : ");
                    double currentBalance = sc.nextDouble();

                    System.out.print("Enter Overdraft Limit : ");
                    double overdraft = sc.nextDouble();

                    Currentaccount current =
                            new Currentaccount(currentAccNo,
                                               currentBalance,
                                               overdraft);

                    System.out.print("Enter Deposit Amount : ");
                    double currentDeposit = sc.nextDouble();

                    current.deposit(currentDeposit);

                    System.out.print("Enter Withdraw Amount : ");
                    double currentWithdraw = sc.nextDouble();

                    current.withdraw(currentWithdraw);

                    break;

                // Transaction
                case 3:

                    System.out.println("\n===== Transaction =====");

                    System.out.print("Enter Transaction ID : ");
                    int transactionId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Transaction Type : ");
                    String transactionType = sc.nextLine();

                    System.out.print("Enter Amount : ");
                    double transactionAmount = sc.nextDouble();

                    Transection t1 =
                            new Transection(transactionId,
                                             transactionType,
                                             transactionAmount);

                    System.out.println();

                    t1.displayTransaction();

                    break;

                // Exit
                case 4:

                    System.out.println("Thank You For Using Banking System");

                    break;

                // Invalid Choice
                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
