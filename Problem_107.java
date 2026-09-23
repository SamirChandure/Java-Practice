import java.util.Scanner;
public class Problem_107 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Strings: ");
        String str= sc.nextLine();
        String str1 []=str.split(" ");
        String largestWord=str1[0];
        for(String str2 : str1){
            if(str2.length()>largestWord.length()){
                 largestWord=str2;
            }
        }
        System.out.println("Largest Words Is: " + largestWord);
        sc.close();
    }
}
