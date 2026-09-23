import java.util.Scanner;
public class Problem_89 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str=sc.nextLine();
        String str1 []=str.split(" ");
        StringBuilder sb= new StringBuilder();
        for(String word: str1  ){
            sb.append(word);
            sb.append(" ");

        } 
        System.out.print(sb);
        sc.close();
    }
}
