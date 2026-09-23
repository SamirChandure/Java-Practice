import java.util.Scanner;
public class Problem_41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        while(true){
            System.out.print("-----MENU------\n");
            System.out.println("1. Print Even Numbers");
            System.out.println("2. Print Odd Numbers");
            System.out.println("3. Print Multiplication Table");
            System.out.println("4. Calculate Factorial");
            System.out.println("5. Exit\n");

            System.out.print("Enter Your Choice: ");
            int choice=sc.nextInt();

            if(choice==1){
                System.out.print("Enter The Number: ");
                int number=sc.nextInt();
                
                System.out.print("Even: ");
                int i=0;
                while(i<=number){
                     if(i%2==0){
                         System.out.print(i  + " ");
                    
                }i++;
                
                }
            System.out.println();
            System.out.println();
            
            }
          else if(choice==2){
                System.out.print("Enter The Number: ");
                int number=sc.nextInt();

                System.out.print("Odd: ");
                int i=1;
                while(i<=number){
                    if(i%2!=0){
                        System.out.print(i+ " ");
                    }
                    i++;
                }
                System.out.println();
                

            }
            
           else if(choice==3){
                System.out.print("Enter The Number: ");
                int number=sc.nextInt();

                System.out.println("Multiplication Table: ");

                int i=1;
                while(i<=10){
                    System.out.println(+ number + "x" + i + " = " +(number*i));
                    i++;
                }
            }  

           else if(choice==4){
                System.out.print("Enter The Number: ");
                int number=sc.nextInt();

               int fact=1;
               int i=1;
               while(i<=number){
                    fact=fact*i;
                    i++;
               }
               System.out.print("The Factorial Is: " + fact);
               System.out.println();
            }

           else if(choice==5){
                System.out.print("Thank You! You Come Exit");
                break;
            }

           
           
           else{
            System.out.println("Invalid Choice");
             }

            
    } 
    sc.close();

}
}
