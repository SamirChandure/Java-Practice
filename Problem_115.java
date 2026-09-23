import java.util.Scanner;

public class Problem_115 {

    static void checkBalance(int balance) {
        System.out.println("Your Balance is: " + balance);
    }

    static int deposit(int balance, int amount) {

        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Invalid Amount");
        }

        return balance;
    }

    static int withdraw(int balance, int amount) {

        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        else if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Invalid Amount");
        }

        return balance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        while(true) {

            System.out.println();
            System.out.println("=========== Bank System ===========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {

                checkBalance(balance);

            }

            else if(choice == 2) {

                System.out.print("Enter The Deposit Amount: ");
                int amount = sc.nextInt();

                balance = deposit(balance, amount);

                System.out.println("Your Total Balance Is: " + balance);
            }

            else if(choice == 3) {

                System.out.print("Enter The Withdraw Amount: ");
                int amount = sc.nextInt();

                balance = withdraw(balance, amount);

                System.out.println("Your Remaining Balance Is: " + balance);
            }

            else if(choice == 4) {

                System.out.println("Thank You!");
                break;
            }

            else {

                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}