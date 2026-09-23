import java.util.Scanner;
public class Problem_101 {
    static boolean search(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Search Element: ");
        int target=sc.nextInt();
        System.out.println("Enter The Size Of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter The Element: ");
            arr[i]=sc.nextInt();
        }
        boolean result=search(arr, target);
        System.out.println(result);
        sc.close();



    }
}
