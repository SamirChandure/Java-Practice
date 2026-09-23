import java.util.Scanner;
public class Problem_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();
       int num=n;

        int x=1;
        int sum=0;
        while(x<=n){
            sum=sum+x;
            x++;
        }
        System.out.println("The Sum Of " + num + " IS = " +sum);
        sc.close();
    }
}
