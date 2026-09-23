import java.util.Scanner;
public class Problem_97 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=sc.nextInt();
        System.out.println();
        boolean isPrime=true;
        if(num<=1){
             isPrime=false;
            
        }
        
        for(int i=2; i<num; i++){
            
            if(num%i==0){
                 isPrime=false;
                 break;
            }
        }
        if(isPrime){
            System.out.println("Prime");

        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();

    }
}
