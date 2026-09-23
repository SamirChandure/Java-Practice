import java.util.Scanner;
public class Problem_85 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        int countWords=0;
        String Words []=str.split(" ");
        for( String Word : Words){
            countWords=countWords+1;

        }
        System.out.println("Words Is: " + countWords);
    }
}
