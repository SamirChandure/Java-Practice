import java.util.Scanner;
public class Problem_38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Marks: ");
        int marks=sc.nextInt();

        if(marks>=90){
            System.out.println("Distinction");
        }
        else if(marks>=75 && marks<90){
            System.out.println("First Class");
        }
        else if(marks>=60 && marks<75){
            System.out.println("Second Class");
        }
        else if(marks>=35 && marks<60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
