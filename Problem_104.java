import java.util.Scanner;
public class Problem_104 {
    static boolean isPalindrome(String str){
       String oriStr=str; 
       String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if(oriStr.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str=sc.nextLine();
        boolean result=isPalindrome(str);
        System.out.println("Is Palindrome: " + result);
        sc.close();

    }
}
