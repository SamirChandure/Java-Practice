import java.util.Scanner;
public class Problem_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

       String correctpassword="Sam@123";

       while(true){
        System.out.print("Enter The Password: ");
        String password=sc.nextLine();
        
        if(password.equals(correctpassword)){
            System.out.println("Login Successful");
            break;
        }
        else{
            System.out.println("Incorrect Password");
        }
       }
       sc.close();
    }
}
