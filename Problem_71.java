import java.util.Scanner;
public class Problem_71 {
    static int reverseNumber(int n){
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The  Number: ");
        int n=sc.nextInt();
        int num=n;
        int result=reverseNumber(n);
        System.out.println("Reverse Number: " + result);
        if(num==result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
