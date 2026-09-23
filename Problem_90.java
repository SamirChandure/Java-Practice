import java.util.Scanner;
public class Problem_90 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter The Strings: ");
    String str= sc.nextLine();
    String words []=str.split(" ");
    StringBuilder sb= new StringBuilder();
    for(String word : words){
        sb.append(word + " ");
    }
    System.out.print(sb );
    sc.close();


   } 
}
