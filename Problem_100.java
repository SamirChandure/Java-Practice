import java.util.Scanner;

public class Problem_100 {

    static void reverseArray(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter The Number: ");
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.print("Reverse Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}