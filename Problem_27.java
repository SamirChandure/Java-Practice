import java.util.Scanner;
public class Problem_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();
         int num=n;

        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("The Sum Of " + num + " Is = " +sum);      
        sc.close();
    }
}
