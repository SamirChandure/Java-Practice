import java.util.Scanner;
public class Problem_82 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Strings: ");
        String str= sc.nextLine();
        System.out.println();
        System.out.print("Enter The Charecter: ");
        char cha=sc.next().charAt(0);
        int countFrequency=0;
        for(char ch : str.toCharArray()){
            if(cha==ch){
                countFrequency=countFrequency+1;

            }
        }
        System.out.println(" Charecter " + cha + " Occure " + countFrequency + " Time ");
        sc.close();


    }
}
