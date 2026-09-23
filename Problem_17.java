import java.util.Scanner;
public class Problem_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Username: ");
        String username=sc.nextLine();
        System.out.print("Enter The Password: ");
        int password=sc.nextInt();

        if(username.equals("Sam") && password==123){
            System.out.println("Login Successful");
         }
        else if(!username.equals("Sam")){
            System.out.println("Invalid Username");
        } 
        else if(password!=123){
            System.out.println("Invalid Password");
        }
         
        sc.close();

    }
}
