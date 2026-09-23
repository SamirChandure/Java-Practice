import java.util.Scanner;
public class Problem_37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name=sc.nextLine(); 

        System.out.print("Enter Your Age: ");
        int age=sc.nextInt();

        System.out.print("Enter Your Percentage: ");
        double percentage=sc.nextDouble();
        
        System.out.print("You Are Currently Enrolled ?:  ");
        boolean enrolled=sc.nextBoolean();

        System.out.println(" Name: " + name  );
        System.out.println(" Age: " + age);
        System.out.println(" Percentage: " + percentage );
        System.out.println("Enrolled: " +enrolled);
        sc.close();


    }
}
