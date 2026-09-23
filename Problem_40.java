import java.util.Scanner;
public class Problem_40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int number=sc.nextInt();

        int i=1;
        int fact=1;
        while(i<=number){
            fact=fact*i;
            i++;
        }
        
        System.out.print("Factorial Of " + number + "Is: " + fact);

        
        
        sc.close();
    }
}
