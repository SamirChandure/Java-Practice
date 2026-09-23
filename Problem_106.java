import java.util.Scanner;
public class Problem_106 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Strings: ");
        String str= sc.nextLine();
        int countWords=0;
        String str1 []=str.split(" ");
        for(String str2 : str1){
            countWords=countWords+1;
        }
        System.out.println("Words Is: " + countWords);
        sc.close();
    }
}
