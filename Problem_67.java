import java.util.Scanner;
public class Problem_67 {
    static long factorial(int n){
        int i=1;
        long fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
       return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n=sc.nextInt();
        long result= factorial(n);
        System.out.println("Factorial: " + result);

        sc.close();
    }
}
