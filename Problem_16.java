import java.util.Scanner;
public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Balance: ");
        int balance=sc.nextInt();
        System.out.print("Enter The Withdrawal Amount: ");
        int amount=sc.nextInt();

        if(balance>=amount){
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
        sc.close();

    }
}
