import java.util.Scanner;
public class Problem_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Customer Name: ");
        String name=sc.nextLine();
        System.out.print("Enter The Account Number: ");
        long acc_num=sc.nextLong();
        System.out.print("Enter The Current Balance: ");
        int balance=sc.nextInt();
        System.out.print("Enter The Withdrawal Amount: ");
        int amount=sc.nextInt();

        if(balance>=amount){
            System.out.println("Withdrawal Successful");
            System.out.println((balance-amount) + " Rupees Is Remaining In Account");
        }
        else{
            System.out.println("Insufficient Balance");
        }
        sc.close();
        
    }
    
}
