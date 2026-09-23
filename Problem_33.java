import java.util.Scanner;
public class Problem_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        int correctpin=1234;

        while (true){
            System.out.print("Enter The Correct Pin: ");
            int pin=sc.nextInt();
            if(pin==correctpin){
                System.out.println("Your Pin Is Correct");
                break;
            
            }    
            
            else{
                System.out.println("Pin Is Incorrect");
            }   
        }   
        sc.close();



    }
}
