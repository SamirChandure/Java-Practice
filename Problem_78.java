import java.util.Scanner;
public class Problem_78 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        int spaceCount=0;
        String str= sc.nextLine();
        for( char ch : str.toCharArray()){
            if(ch==' '){
                spaceCount=spaceCount+1;
            }
    }
    System.out.println("Space Is: " + spaceCount);
    sc.close();
}
}
