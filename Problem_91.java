import java.util.Scanner;
public class Problem_91 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.print(sb);
        sc.close();
    }
}
