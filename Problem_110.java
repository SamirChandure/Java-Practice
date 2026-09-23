import java.util.Scanner;
public class Problem_110 {
    static void isPrime(int num){
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
            
        if(isPrime){
            System.out.println("Prime");
        }    
        else{
            System.out.println("Not Prime");
        }
        
    }
    static void isPalindrome(int num){
        int ori=num;     
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==ori){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        
    }
    static void reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        System.out.println("Reverse Number Is: " + rev);

    }
    static void countDigit(int number){
        int countDigit=0;
        while(number!=0){
            number=number/10;  
            countDigit=countDigit+1;
        
        }
        System.out.println("Count Digit Is: " + countDigit);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=sc.nextInt();
        isPrime(num);
        isPalindrome(num);
        reverse(num);
        countDigit(num);
        sc.close();
    }
}
