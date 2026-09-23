import java.util.Scanner;
public class Problem_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int x=1;
        int fact=1;
        while(x<=n){
            fact=fact*x;
            x++;
        }
        System.out.println("The Fact Is = " + fact);
        sc.close();
    }
}
