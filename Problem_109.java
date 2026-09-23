import java.util.Scanner;
public class Problem_109 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();
        System.out.println();
        int arr []=new int[size-1];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter The Numbers: ");
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<=size; i++){
            boolean found=false;
            for(int j=0; j<arr.length; j++){
                if(i==arr[j]){
                    found=true;
                    break;
                }
            }
            if(found==false){
                System.out.println("Missing Number Is: " + i);
            }
        }
        sc.close();
    }
}
