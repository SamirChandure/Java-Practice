import java.util.Scanner;
public class Problem_42 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter The Size Of Array: ");
    int size=sc.nextInt();

    int x[]= new int[size];
    
    for( int i=0; i<x.length; i++){
        System.out.print("Enter The Number: ");
        x[i]=sc.nextInt();
     }
     System.out.println();

    System.out.println("Array Element: ");

    for(int i=0; i<x.length; i++){
        System.out.println(x[i]);
    }
    sc.close();
    

    }
}
