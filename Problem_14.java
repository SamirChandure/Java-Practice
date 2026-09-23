import java.util.Scanner;
public class Problem_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The 1st Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter The 2nd Number: ");
        int num2=sc.nextInt();
        System.out.print("Enter The 3rd Number: ");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println( num1 + " Is Greater");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + " Is Greater");
        }
        else if(num3>num1 && num3>num2){
            System.out.println( num3 + " Is Greater");
        }
        else{
            System.out.println("Three Number Are Equal");
        }
        sc.close();

    }
}
