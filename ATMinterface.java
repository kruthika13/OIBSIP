import java.util.Scanner;

public class ATMinterface {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        System.out.println(" ");
        System.out.println("enter an option to proceed");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                checkBalance();
                break;

            case 2:
                deposit();
                break;

            case 3:
                withdraw();
                break;

            case 4:
                System.out.println("Thank you, visit again");
                System.exit(0);

            default:
                System.out.println("Invalid option. Please try again");
                main(null);
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is $" + balance);
        anotherTransaction();
    }

    private static void deposit() {
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please try again.");
            deposit();
        } else {
            balance += amount;
            System.out.println("$" + amount + " has been deposited to your account.");
            System.out.println("Your new balance is $" + balance);
            anotherTransaction();
        }
    }

    private static void withdraw() {
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please try again.");
            withdraw();
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Please try again.");
            withdraw();
        } else {
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn from your account.");
            System.out.println("Your new balance is $" + balance);
            anotherTransaction();
        }
    }

    private static void anotherTransaction() {
        System.out.println(" ");
        System.out.println("Do you want another transaction?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                main(null);
                break;

            case 2:
                System.out.println("Thank you, visit again");
                System.exit(0);

            default:
                System.out.println("Invalid option. Please try again.");
                anotherTransaction();
        }
    }
}