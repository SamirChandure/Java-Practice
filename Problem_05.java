import java.util.Scanner;
public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter The Student Name: ");
        String name=sc.nextLine();

        System.out.print("Enter The Roll Number: ");
        int roll=sc.nextInt();

        System.out.print("Enter The Marks Of NA: ");
        int NA=sc.nextInt();
        System.out.print("Enter The Marks OF Ss: ");
        int Ss=sc.nextInt();
        System.out.print("Enter The Marks Of Ands: ");
        int Andc=sc.nextInt();
        System.out.print("Enter The Marks Of OE: ");
        int OE=sc.nextInt();
        System.out.print("Enter The Marks Of MDM: ");
        int MDM=sc.nextInt();

        


        int total_Marks=NA+Ss+Andc+OE+MDM;
        int Average=total_Marks/5;

        System.out.println("------Student Marksheet-------");
        System.out.println("Student Name: " + name);
        System.out.println("Roll_Number: " + roll);


        System.out.println("NA: " + NA);
        System.out.println("Ss: " + Ss);
        System.out.println("Andc: " + Andc);
        System.out.println("OE: " + OE);
        System.out.println("MDM: " + MDM);



        
        System.out.println("Total_Marks: " + total_Marks);
        System.out.println("Average_Marks: " + Average);

        System.out.println("--------------------------");
    }

    
}
