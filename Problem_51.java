import java.util.Scanner;
public class Problem_51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int search= sc.nextInt();
        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();
        int count=0;

        int x[]= new int[size];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();

        }

        System.out.println();

        System.out.println("Array Element: ");

        for(int i=0; i<x.length; i++){
            System.out.println(" " + x[i]);
            if(x[i]==search){
                count=count+1;
            }

        }
        System.out.print(+ search + " Occures " + count + " Time " );
        sc.close();
    }
}
