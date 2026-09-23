import java.util.Scanner;
public class Problem_46 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int evencount=0;
        int oddcount=0;

        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();

        int x[]= new int[size];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }
        System.out.println();
        
        System.out.print("Array Element: ");

        for(int i=0; i<x.length; i++){
            System.out.print(" " + x[i]);
            
            if(x[i]%2==0){
                evencount=evencount+1;
             }
            else{
                oddcount=oddcount+1;
            } 
        }
        System.out.print("Even: " + evencount);
        System.out.println();
        System.out.print("Odd: " + oddcount);
        sc.close();
    }
}
