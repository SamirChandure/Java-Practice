import java.util.Scanner;
public class Problem_83 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        System.out.println();
        System.out.print("Enter The Charecter: ");
        char character=sc.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(character==str.charAt(i)){
                System.out.println(i);
                break;}
                
            

                
            
                

        }
        
        
        sc.close();
    }
}
