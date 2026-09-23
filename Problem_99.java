import java.util.Scanner;
public class Problem_99 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter The Number: ");
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int secondLargest=arr[1];
        System.out.print("Array Element: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
             else if(arr[i]>secondLargest){
                 secondLargest=arr[i];
            }
        }
        System.out.println();
       System.out.print("Second Largest Is: " + secondLargest);
       sc.close();
    }
}
