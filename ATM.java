import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);

        int choice;

        do {

            System.out.println("\n==========================");
            System.out.println("        ATM MENU");
            System.out.println("==========================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input! Enter a number: ");
                sc.next();
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");

                    while (!sc.hasNextDouble()) {
                        System.out.print("Invalid amount. Try again: ");
                        sc.next();
                    }

                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");

                    while (!sc.hasNextDouble()) {
                        System.out.print("Invalid amount. Try again: ");
                        sc.next();
                    }

                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}