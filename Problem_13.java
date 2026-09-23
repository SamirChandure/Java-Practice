import java.util.Scanner;
public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter The 1st Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter The 2nd Number: ");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + " Is Greater");
        }
        else if(num2>num1){
            System.out.println(num2 +" Is Greater");
        }
        else{
            System.out.println("Both Are Similler");
        }
        sc.close();

    }
}
