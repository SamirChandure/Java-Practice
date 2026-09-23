import java.util.Scanner;

public class Problem_96 {
    static int add(int num1, int num2 ){
          return num1+num2;

    }
    static int subtract(int num1, int num2){
        return num1-num2;
    }
    static int multiply(int num1, int num2){
        return num1 * num2;
    }
    static double divide(int num1, int num2){
        return (double) num1/num2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num1=sc.nextInt();
        System.out.println();
        System.out.print("Enter The Number: ");
        int num2=sc.nextInt();
        int add=add(num1, num2);
        int sub=subtract(num1, num2);
        int mul=multiply(num1, num2);
        double div=divide(num1, num2);
        System.out.println("Addition Is: " +add);
        System.out.println("Substraction Is: " + sub);
        System.out.println("Multiplication Is: " + mul);
        System.out.println("Division Is: " + div);
        sc.close();

    }
}
