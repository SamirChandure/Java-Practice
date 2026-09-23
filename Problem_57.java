import java.util.Scanner;

public class Problem_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of Array: ");
        int size = sc.nextInt();

        int[] x = new int[size];

        // Take array elements
        for (int i = 0; i < x.length; i++) {
            System.out.print("Enter The Number: ");
            x[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Array Elements: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.println();
        System.out.println("Duplicate Elements:");

        // Find duplicates
        for (int i = 0; i < x.length; i++) {

            for (int j = i + 1; j < x.length; j++) {

                if (x[i] == x[j]) {
                    System.out.println(x[i]);
                }
            }
        }

        sc.close();
    }
}