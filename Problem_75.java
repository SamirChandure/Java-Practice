import java.util.Scanner;
public class Problem_75 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str=sc.nextLine();
        int count=0;
        for(char ch : str.toCharArray()){
            count=count+1;
                }
                System.out.println("Length Is: " + count);
                sc.close();
    }
}
