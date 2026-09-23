import java.util.Scanner;
public class Problem_69 {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while(i<n){
            if(n%i==0){
                return false;
            }
            i++;
         }
         return true;
         
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n=sc.nextInt();
        boolean result=isPrime(n);
        System.out.println(result);
        sc.close();

    }
}
