import java.util.Scanner;
public class Problem_64 {
    static int square(int n){

     int square=n*n;
     return square;   
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n=sc.nextInt();
        int result=square(n);
        System.out.println(" Square Of " + n + " Is= " + result);

        sc.close();
    }
}
