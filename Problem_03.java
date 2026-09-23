import java.util.Scanner;
public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        int a=sc.nextInt();

        System.out.print("Enter The Second Number: ");
        int b=sc.nextInt();

        System.out.println("The Sum Of Two Number Is: "+ (a+b));
        System.out.println("The Substraction Of Two Number Is: " + (a-b));
        System.out.println("The Multiplication Of Two Number Is: " + (a*b));
        System.out.println("The Division OF Two Number Is: " + (a/b));
        System.out.println("The Remainder OF Two Number Is: " + (a%b));


    }
}
