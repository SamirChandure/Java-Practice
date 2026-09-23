import java.util.Scanner;
public class Problem_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int x=1;
        while(x<=10){
            System.out.println(+ n + "x" + x + "=" + (n * x));
            x++;
        }
    }
}
