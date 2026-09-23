import java.util.Scanner;
public class Problem_45 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double total=0;


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
            total=total+x[i];

        }
        System.out.println();
        double ave=total/size;
        System.out.print("The Ave IS: " + ave);

        sc.close();
    }
    
}
