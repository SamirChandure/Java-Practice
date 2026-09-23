import java.util.Scanner;
public class Problem_111 {
    static void printArray(int arr []){
        System.out.println("Array Element: ");
        for(int i=0; i<arr.length; i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum Is: " + sum);
    }
    static void largest(int arr[]){
        int largestNumber=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largestNumber)
                largestNumber=arr[i];
        }
        System.out.println("Largest Number is: " + largestNumber);
    }
    static void smallest(int arr[]){
        int smallest=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Is: " + smallest);
    }
    static void search(int arr[] , int target){
         boolean found=false;
         for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                found=true;
                break;
            }
         }
         if(found){
            System.out.println(true);
         }
         else{
            System.out.println(false);
         }
    }
    static void reverse(int arr[]){
        System.out.println("Reverse Element Is: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Size Of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            System.err.print("Enter The Number: ");
            arr[i]=sc.nextInt();
        }
System.out.println();
 while(true){
 
     System.out.println("================Menu================");
     System.out.println("1. Print Array");
     System.out.println("2. Sum");
     System.out.println("3. Largest");
     System.out.println("4. Smallest");
     System.out.println("5. Search");
     System.out.println("6. Reverse: ");
     System.out.println("7. Exit");
    
    System.out.println("Enter Your Choice: ");
    int choice=sc.nextInt();

    if(choice==1){
        printArray(arr);
    }

    else if(choice==2){
        sum(arr);
    }

    else if(choice==3){
      largest(arr);
    }

    else if(choice==4){
       smallest(arr);
    }
    else if(choice==5){
        System.out.println("Enter The Target Number: ");
        int target=sc.nextInt();
        search(arr, target);
    }
    else if(choice==6){
       reverse(arr);
    }
    else if(choice==7){
        System.out.println("Thank You!");
        break;
    }
    else{
        System.out.println("Ivalid Choice");
    }


 }
 sc.close();
    }
}
