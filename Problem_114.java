import java.util.Scanner;
public class Problem_114 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter The Number: ");
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int secondLargest=arr[1];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println();
        System.out.println("Second Largest Is: " + secondLargest);
        sc.close();

    }
}
