package n.projectBkas;

import java.util.Scanner;

public class BkasApps {

    int balance;
    int previousTransaction;
    String CustomerName;
    String customerId;

    public BkasApps(String CustomerName, String customerId) {
        this.CustomerName = CustomerName;
        this.customerId = customerId;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }

    }

    void withdrow(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("deposited: " + previousTransaction);

        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction is occoured");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome " + CustomerName);
        System.out.println("Your id is: " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("Enter an option");
            option = input.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("Balance = " + balance);
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit");
                    int amount = input.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw");
                    int amount2 = input.nextInt();
                    withdrow(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    getPreviousTransaction();
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("********");
                    break;

                default:
                    System.out.println("Invalid option !! please enter again");
                    break;
            }

        } while (option != 'E');
        System.out.println("Thank you for using our services");

    }

}
