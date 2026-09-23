import java.util.Scanner;
public class Problem_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int x=1;
        while(x<=n){
            System.out.println(x);
            x++;
        }
        sc.close();
    }
}
