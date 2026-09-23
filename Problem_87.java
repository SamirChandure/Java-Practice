import java.util.Scanner;
public class Problem_87 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String duplicate="";
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++);
            char ch=
            if(str.charAt(i)==str.charAt(j)){
                duplicate=duplicate+str.charAt(j)
            }
            }
        }
    }

    System.out.println("Duplicate Char Is: " + duplicate);

            
    }
}
