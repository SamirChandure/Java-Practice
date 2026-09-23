import java.util.Scanner;
public class Problem_81 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Strings: ");
        String str=sc.nextLine();
        String result="";
        for(char ch : str.toCharArray() ){
            if(ch!=' '){
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
