import java.util.Scanner;
public class Problem_63 {
    static int add(int a, int b){
        int sum=a+b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int a=sc.nextInt();
        System.out.println("Enter The  Number: ");
        int b=sc.nextInt();
        int result=add(a, b);
        System.out.println("Sum= " + result);


        sc.close();
    }
}
