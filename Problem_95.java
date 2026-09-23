import java.util.Scanner;
public class Problem_95 {
    static String reverse(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The strings: ");
        String str=sc.nextLine();
        String result=reverse(str);
        System.out.println("Reverse Is: " + result);
        sc.close();
    }


    

}
