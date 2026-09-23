import java.util.Scanner;
public class Problem_80 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter The Strings: ");
    String str= sc.nextLine();
    String rev ="";
    for(int i=str.length()-1; i>=0; i--){
        char ch= str.charAt(i);
        rev=rev+ch;
    }
    System.out.println("Reverse Is: " + rev);
    sc.close();































   } 
}
