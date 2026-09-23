import java.util.Scanner;
public class Problem_55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Size Of Array: ");
        int size= sc.nextInt();
        System.out.println();

        int x[]= new int[size];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }
        System.out.println();
        
        System.out.print("Array Element: ");
        for(int i=0; i<x.length; i++){
            System.out.print(" " + x[i]);
        }

        System.out.println();

       System.out.print("Array Reverse Element: ");
       for(int i=x.length-1; i>=0; i--){
           System.out.print(" " + x[i]);
       }
       sc.close();
    }
}
