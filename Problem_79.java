import java.util.Scanner;
public class Problem_79 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        int uppercaseCount=0;
        int lowercaseCount=0;
        for(char ch : str.toCharArray())
        {
            if(Character.isUpperCase(ch)){
                uppercaseCount=uppercaseCount+1;
            }
            else if(Character.isLowerCase(ch)){
                lowercaseCount=lowercaseCount+1;
            }
        }
        System.out.println("Uppercase Is: " + uppercaseCount);
        System.out.println("Lowercase Is: " + lowercaseCount);
        sc.close();
    }
}
