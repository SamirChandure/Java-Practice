import java.util.Scanner;
public class Problem_58 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Number Of Row: ");
        int row=sc.nextInt();
        System.out.print("Enter The Number Of Column: ");
        int col=sc.nextInt();

        int x[][]= new int[row][col];

        for(int i=0; i<row; i++){

            for(int j=0;j<col; j++){
                System.out.print("Enter The Number: ");
                x[i][j]=sc.nextInt();
            }

        }

        System.out.println("Array Element: ");

        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                System.out.print(" " + x[i][j]);
            }
            
            
        }
        sc.close();
    }
}
