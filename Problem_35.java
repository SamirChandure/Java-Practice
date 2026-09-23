import java.util.Scanner;
public class Problem_35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        

        while (true){
            System.out.println("------Calculator-------");


            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.print("Enter Your Choice: ");
            int choice=sc.nextInt();
            
            
            

            

            if(choice==1){
                System.out.print("Enter The 1st Number: ");
                int num1=sc.nextInt();
                System.out.print("Enter The 2nd Number: ");
                int num2=sc.nextInt();
                System.out.println("The Addition Of Two Number Is: " +(num1+num2));
            }
            else if(choice==2){
                System.out.print("Enter The 1st Number: ");
                int num1=sc.nextInt();
                System.out.print("Enter The 2nd Number: ");
                int num2=sc.nextInt();
                System.out.println("The Substraction Of Two Number Is: " +(num1-num2));
            } 
            else if(choice==3){
                System.out.print("Enter The 1st Number: ");
                int num1=sc.nextInt();
                System.out.print("Enter The 2nd Number: ");
                int num2=sc.nextInt();
                System.out.println("The Multiplication Of Two Number Is: " +(num1*num2));
            }  
            else if(choice==4){
                System.out.print("Enter The 1st Number: ");
                int num1=sc.nextInt();
                System.out.print("Enter The 2nd Number: ");
                int num2=sc.nextInt();
                System.out.println("The Division Of Two Number IS: " +(num1/num2));
            } 
            
            
            else if(choice==5){
                System.out.println("Thank You!");
                break;
            
            }
            else{
                System.out.println("Invalid Choice");
            }
            

        }
        sc.close();
    }
}
