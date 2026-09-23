import java.util.Scanner;
public class Problem_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Name: ");
        String name=sc.nextLine();

        System.out.print("Enter THe Age: ");
        int age=sc.nextInt();

        sc.nextLine();

        System.out.print("Enter The Gender: ");
        char gender=sc.next().charAt(0);

        System.out.print("Enter The Phone Number: ");
        long number=sc.nextLong();

        System.out.print("Enter The Percentage: ");
        double percentage=sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter The City: ");
        String city=sc.nextLine();

        System.out.println("-------Student Information--------");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Number: " + number);
        System.out.println("Percentage: " +percentage);
        System.out.println("City: " + city);

        sc.close();



        
    }
    
}
