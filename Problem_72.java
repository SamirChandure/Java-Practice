import java.util.Scanner;
public class Problem_72 {
    static int digitSum(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Numbers: ");
        int n=sc.nextInt();
        int result=digitSum(n);
        System.out.println("Sum Of Digit Is: " + result);
        sc.close();
    }
}
