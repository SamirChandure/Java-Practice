import java.util.Scanner;
public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int marks;
        System.out.print("Enter The Marks: ");
        marks=sc.nextInt();

        if(marks>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        sc.close();
           


    }
}
