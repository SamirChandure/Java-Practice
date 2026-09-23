import java.util.Scanner;
public class Problem_50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int search=sc.nextInt();
        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();
        System.out.println();

        int x[]= new int[size];

        for(int i=0; i<x.length; i++){
            System.out.print("Enter The Number: ");
            x[i]=sc.nextInt();
        }
    boolean found=false;
    System.out.println();
        for(int i=0; i<x.length; i++){
            
        
            if(search==x[i]){
                found=true;
                break;
            }



        }
        if(found){
            System.out.print(" Element " + search + " Is Found ");
        }
        else{
            System.out.println(" Element " + search + " Is Not Found ");
        }
        

    sc.close();
    }
    
}
