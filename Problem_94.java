import java.util.Scanner;
public class Problem_94 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        int countVowels=0;
        int countConsonents=0;
        int countDigit=0;
        int countSpaces=0;
        for(char ch : str.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                countVowels=countVowels+1;
            }
            else if(Character.isLetter(ch)){
                countConsonents=countConsonents+1;
            }
            else if(Character.isDigit(ch)){
                countDigit=countDigit+1;
            }
            else if(ch==' '){
                countSpaces=countSpaces+1;

            }
        }
        System.out.print("Vowels Is: " + countVowels);
        System.out.println();
        System.out.print("Consonent Is: " + countConsonents);
        System.out.println();
        System.out.print("Digit Is: " + countDigit);
        System.out.println();
        System.out.print("Spaces Is: " + countSpaces  );
        sc.close();
    }
}
