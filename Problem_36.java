import java.util.Scanner;
public class Problem_36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("------MENU------");
            System.out.println("\n1.Print Even Numbers\n2.Print Odd Numbers\n3.Print Table\n4.Exit");
            System.out.print("\nEnter Your Choice: ");
            int choice=sc.nextInt();

            if (choice==1){
                System.out.print("Enter Any Number: ");
                int number=sc.nextInt();
                int i=0;
                System.out.println("Even Number: ");
                while(i<=number){
                    if(i%2==0){
                        System.out.println(i);
                    }i++;
                    
                }
            }
            else if(choice==2){
                System.out.print("Enter Any Number: ");
                int number=sc.nextInt();
                int i=1;
                System.out.println("Odd Number: ");
                while(i<=number){
                    if(i%2!=0){   
                           System.out.println(i); 
                    }i++;
                }
            }
            else if(choice==3){
                System.out.print("Enter Any Number: ");
                int number=sc.nextInt();
                int i=1;
                System.out.println("Multiplication Table Of: " + number);
                while(i<=10){
                    System.out.println( number + " x " + i + " = " +(number * i));
                    i++;
                }  
            }
            else if(choice==4){
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
