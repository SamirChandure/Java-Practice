import java.util.Scanner;
public class Problem_74 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Name: ");
        String name=sc.next();
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
}
