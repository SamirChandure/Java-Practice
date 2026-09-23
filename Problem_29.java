import java.util.Scanner;
public class Problem_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int x=0;
        int sum=0;
        while(x<=n){
            if (x%2==0){
                sum=sum+x;
            }
            x++;
        }
        System.out.println("The Sum OF Even Number IS =" + sum);
        sc.close();
        
    }
    
}
