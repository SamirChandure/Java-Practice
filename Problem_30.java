import java.util.Scanner;
public class Problem_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int x=1;
        int count=0;
        while(x<=n){
            count=count+1;
            x++;
        }
        System.out.println("The Number Between 1 To N IS = " + count);
        sc.close();
    }
    
}
