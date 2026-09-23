import java.util.Scanner;
public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Name: ");
        String name= sc.nextLine();

        System.out.print("Enter The Age: ");
        int age= sc.nextInt();

        System.out.print("Enter The Height: ");
        float height= sc.nextFloat();

        System.out.println("Check IS It Student OR not: ");
        boolean isStudent= sc.nextBoolean();

        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("IS Student: " + isStudent);
    }
    
}
