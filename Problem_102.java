import java.util.Scanner;
public class Problem_102 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        StringBuilder sb=new StringBuilder(); 
        for(char ch : str.toCharArray()){
            if(ch!=' '){
                sb.append(ch);
            }
        }
        System.out.print("Strings Is: " + sb);
        sc.close();
        
    }
}
