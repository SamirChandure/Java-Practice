import java.util.Scanner;
public class Problem_66 {
    static void maximum(int a , int b){
        if(a>b){
            System.out.println("Number " + a + " Is Greater Than " + b);
        }
        else{
            System.out.println(" Number " + b + " Is Greater Than " + b);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int a=sc.nextInt();
        System.out.println("Enter The Number: ");
        int b=sc.nextInt();
        maximum(a, b);

        sc.close();
    }
}
