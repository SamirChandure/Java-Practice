import java.util.Scanner;
public class Problem_92 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size=sc.nextInt();
        int sum=0;
        System.out.println();
        int arr []= new int [size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter The Number: ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Array Element: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.println();
            sum=sum+arr[i];

        }
        System.out.print("Sum Is: " + sum);
        sc.close();
    }
}
