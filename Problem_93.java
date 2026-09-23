import java.util.Scanner;
public class Problem_93 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Size Of Array: ");
        int size= sc.nextInt();
        int arr []= new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter The Number: ");
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        System.out.println("Array Element: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println();
        System.out.print("Largest Element: " + largest);
        sc.close();
    }
}
