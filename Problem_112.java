import java.util.Scanner;
public class Problem_112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str=sc.nextLine();
        for(char ch : str.toCharArray()){
            int count =0;
            for(int i=0; i<str.length(); i++){
                  if(ch==str.charAt(i)){
                    count=count+1;
                  }
            }
           if(count==1){
            System.out.println(ch);
            break;
           }
        }
        sc.close();
        
    }
}
