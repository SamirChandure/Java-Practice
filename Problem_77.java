import java.util.Scanner;
public class Problem_77 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        int countDigit=0;
        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
                countDigit=countDigit+1;
            }
        }
        System.out.print("Digit Is: " + countDigit);
        sc.close();

    }
}
