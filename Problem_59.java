import java.util.Scanner;
public class Problem_59 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int countrow=0;
        int countcol=0;

        System.out.print("Enter The Number Of Row: ");
        int row = sc.nextInt();
        System.out.print("Enter The Number Of Colomn: ");
        int col = sc.nextInt();
        System.out.println();

        int x[][]= new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter The Number: ");
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Array Element: ");

        for(int i=0; i<row; i++){
            countrow=countrow+1;
            for(int j=0; j<col; j++){
                System.out.print(" " + x[i][j]);
                countcol=countcol+1;

            }
            System.out.println();



        }
        System.out.print("Rows: " + countrow);
        System.out.println();
        System.out.print("Cols: " + countcol);

        sc.close();
    }
}
