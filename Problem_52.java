import java.util.Scanner;
public class Problem_52 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();

        int x[]= new int[size];

        

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();

        }
        int largest=x[0];
        int secondlargest=x[1];
        if(x[0] > x[1]) {
            largest = x[0];
            secondlargest = x[1];
                }
        else {
           largest = x[1];
           secondlargest = x[0];
             }

        System.out.println("Array Element: ");

        for(int i=2; i<x.length; i++){
            System.out.println(" " + x[i]);
            if(x[i]>largest){
                secondlargest=largest;
                largest=x[i];
                

            }
            else if(x[i]>secondlargest){
                secondlargest=x[i];
            }    
            

        }
        System.out.print("Largest: " + largest);
        System.out.println();
        System.out.print("Second Largest: " + secondlargest);

        sc.close();

        
    }
}
