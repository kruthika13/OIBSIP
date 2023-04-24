import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        int balance = 50000;
        int choice, amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch(choice){

            case 1:
                System.out.println("Your current balance is $" + balance);
                break;

            case 2:
                System.out.println("Enter the total amount to withdraw: ");
                amount = scanner.nextInt();
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Your new balance is $" + balance);
                } else {
                    System.out.println("Insufficient funds!");
                }
                break;

            case 3:
                System.out.println("Enter the amount to deposit: ");
                amount = scanner.nextInt();
                balance += amount;
                System.out.println("Your new balance is $" + balance);
                break;

            case 4:
                System.out.println("Thank you,visit again!");
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }

}