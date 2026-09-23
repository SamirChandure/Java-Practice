import java.util.Scanner;
public class Problem_53 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();

        int x[]= new int[size];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }

        System.out.print("Even: ");

        
        for(int i=0; i<x.length; i++){
            if(x[i]%2==0){
                System.out.print(" " + x[i]);
                
               } 
            }

            System.out.println();
        System.out.print("Odd");
        
       for(int n=0; n<x.length; n++){
        if(x[n]%2!=0){
          System.out.print(" " + x[n]);
          }
         }


    
        
        sc.close();

    }
}
