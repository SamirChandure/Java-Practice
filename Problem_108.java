import java.util.Scanner;
public class Problem_108 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(char ch: str.toCharArray()){
            if(sb.indexOf(String.valueOf(ch))==-1){
                sb.append(ch);
            }
        }
        System.out.println("Original Strings Is: " + sb);
        sc.close();
    }
}
