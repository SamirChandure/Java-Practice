import java.util.Scanner;
public class Problem_98 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                
        }
        if(isPrime){
            System.out.println(i);
        }

        }
        sc.close();
    }
}
