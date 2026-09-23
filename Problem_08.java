import java.util.Scanner;
public class Problem_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Name: ");
        String name=sc.nextLine();

        System.out.print("Enter The Account Number: ");
        long account_number=sc.nextLong();

        System.out.print("Enter The Current Balance: ");
        double balance=sc.nextDouble();

        System.out.print("Enter The Amount To Deposit: ");
        int amount=sc.nextInt();

        System.out.println("--------MINI ATM INFORMATION SYSTEM--------");
        
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Current Balance: " + balance);
        System.out.println("Amount to Deposit: " + amount);

        sc.close();
    }
    
}
