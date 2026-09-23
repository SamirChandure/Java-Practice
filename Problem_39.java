import java.util.Scanner;
public class Problem_39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int number=sc.nextInt();

        int i=1;
        int evensum=0;
        int oddsum=0;
        System.out.print("Even: ");
        while(i<=number){
            if(i%2==0){
                System.out.print( i + " " );
                evensum=evensum+i;
            }i++;
        }
        System.out.println();
        
        int x=1;
        System.out.print("Odd: ");
        while(x<=number){
            if(x%2!=0){
                System.out.print(x + " ");
                oddsum=oddsum+x;
            }
            x++;
        }
        System.out.println("\n");

        System.out.println("Even Sum: " +evensum);
        System.out.println("Odd Sum: " +oddsum);
        
        sc.close();
    }
    
}
