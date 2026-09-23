import java.util.Scanner;
public class Problem_70 {
    static int countDigit(int n){
        int count=0;
        while(n!=0){
            n=n/10;
           count=count+1;
           
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n=sc.nextInt();
       int  result= countDigit(n);
       System.out.println("Digit = " +result);       
       sc.close();
    }
}
