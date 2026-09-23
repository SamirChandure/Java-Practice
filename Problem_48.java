import java.util.Scanner;
public class Problem_48 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The size Of Array: ");
        int size=sc.nextInt();

        int x[]= new int[size];
        

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }
        int smallest= x[0];

        System.out.println("Array Element: ");

        for(int i=0; i<x.length; i++){
            System.out.println(" " + x[i]);
            if(x[i]<smallest){
                smallest=x[i];
            }
        }
        System.out.print("Smallest: " + smallest);
        sc.close();


    }
    
}
