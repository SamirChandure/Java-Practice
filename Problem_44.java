import java.util.Scanner;
public class Problem_44 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int sum=0;

    System.out.print("Enter The Size Of Array: ");
    int size=sc.nextInt();
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
        sum=sum+x[i];

    }
    System.out.println();
    System.out.print("The Sum Is: " + sum);

    sc.close();


   } 
}
