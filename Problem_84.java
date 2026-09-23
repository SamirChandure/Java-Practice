import java.util.Scanner;
public class Problem_84 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str1=sc.nextLine();
        String largestWord="";
        String str2 []=str1.split(" ");
        for(String  str : str2){
            if(str.length()>largestWord.length()){
                  largestWord=str;


            }

        }
        System.out.println("Largest Word Is: " + largestWord);
        sc.close();
    }
}
