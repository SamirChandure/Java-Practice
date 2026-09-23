import java.util.Scanner;
public class Problem_113 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Strings: ");
        String str= sc.nextLine();
        int maxCount=0;
        char maxfre=' ';
        for(char ch : str.toCharArray()){
            int count=0;
            for(int i=0; i<str.length(); i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                maxfre=ch;
            }
        }
        System.out.println("Maximun Count Is: " + maxCount);
        System.out.println("Maximum Frequence Is: " + maxfre);
        sc.close();

        
    }
}
