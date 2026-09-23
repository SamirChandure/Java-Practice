import java.util.Scanner;
public class Problem_47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();

        int x[]= new int[size];
        int largest= x[0];
        

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }
        System.out.println();

        System.out.print("Array Element: ");

        for(int i=0; i<x.length; i++){
            System.out.print(" " + x[i]);
            if(x[i]>largest){
                largest=x[i];
            }

        }
        System.out.println();
        System.out.print("Largest: " + largest);
        sc.close();
    }
}
