import java.util.Scanner;
public class Problem_68 {
    static void printTable(int n){
        int i=1;
        while(i<=10){
            System.out.println(+ n + " x " + i + " = " + n * i);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n=sc.nextInt();
        printTable(n);

        sc.close();
    }
}
