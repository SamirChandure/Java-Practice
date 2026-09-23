import java.util.Scanner;
public class Problem_54 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();

        int x[]= new int[size];
        int y[]= new int[x.length];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();

        }
        System.out.println("Array Element Of X: ");

        for(int i=0; i<x.length; i++){
            System.out.println(" " + x[i]);
            y[i]=x[i];
        }
        System.out.println("Array Element Of y: ");

        for( int n=0; n<y.length; n++){
            System.out.println(" " + y[n]);
        }
        sc.close();

    }
}
