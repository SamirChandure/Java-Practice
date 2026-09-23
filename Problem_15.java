import java.util.Scanner;
public class Problem_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Percentage: ");
        int Percentage=sc.nextInt();

        if(Percentage>=75){
            System.out.println("Distinction");
        }
        else if(Percentage>=60 && Percentage<75){
            System.out.println("First Class");
        }
        else if(Percentage>=50 && Percentage<60){
            System.out.println("Second Class");
        }
        else if(Percentage>=35 && Percentage<50){
            System.out.println("Pass");
        }
        else if(Percentage<35){
            System.out.println("Fail");
        }
        sc.close();


    }
}
