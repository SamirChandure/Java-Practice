import java.util.Scanner;
public class Problem_76 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= sc.nextLine();
        int vowelsCount=0;
       // int consonentCount=0;
        for(char ch : str.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowelsCount=vowelsCount+1;
            // else{
            //     consonentCount=consonentCount+1;
            // }
        }
        System.out.print("Vowels: " + vowelsCount);
        // System.out.println("Consonent: " + consonentCount);
        sc.close();
    }
}
