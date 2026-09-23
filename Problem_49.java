import java.util.Scanner;
public class Problem_49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int positive=0;
        int negative=0;
        int zero=0;

        System.out.print("Enter The Size Of Array: ");
        int size= sc.nextInt();

        int x[]= new int[size];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }
        System.out.println("Array Element: ");

        for(int i=0; i<x.length; i++){
            System.out.println(" " + x[i]);
            if(x[i]>0){
                positive=positive+1;
            }
            else if(x[i]<0){
                negative=negative+1;

            }   
            else if(x[i]==0){
                zero=zero+1;
            } 

            }
            System.out.println();
            System.err.println("Positive " + positive);
            System.out.println("Negative: " + negative);
            System.out.println("zere " + zero);

            sc.close();


    


    }
}
