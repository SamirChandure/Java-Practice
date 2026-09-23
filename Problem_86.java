import java.util.Scanner;
public class Problem_86 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str1=sc.nextLine();
        String str2="";
        for(char ch : str1.toCharArray()){
            if(str2.indexOf(ch)==-1){
                str2=str2+ch;
            }
        }
        System.out.print("Orignal Strings Is: " + str2);
        sc.close();

    }
}
