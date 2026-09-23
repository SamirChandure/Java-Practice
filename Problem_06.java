import java.util.Scanner;
public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.print("Enter The Length: ");
        int Length=sc.nextInt();
        System.out.print("Enter The Width: ");
        int Width=sc.nextInt();

        System.out.println("The Area Of Rectangle Is " + (Length*Width));
        System.out.println("The Perimeter Of Rectangle Is " + 2*(Length+Width));



        
    }
    
}
