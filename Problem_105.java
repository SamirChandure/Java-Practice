import java.util.Scanner;
public class Problem_105 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("You Have To Take The Five Subject Marks That's Why You Have To Enter Number 5:  ");
       int size=sc.nextInt(); 
       System.out.println();

       int marks[]=new int[size];
       for(int i=0; i<marks.length; i++){
        System.out.print("Enter The Subjects Marks: ");
        marks[i]=sc.nextInt();
        

       }
       int total=0;
       int highestMarks=marks[0];
       int lowestMarks=marks[0];
       int passed=0;
       int failed=0;
       for(int i=0; i<marks.length; i++){
        total=total+marks[i];
        if(marks[i]>highestMarks){
            highestMarks=marks[i];
        }
        if(marks[i]<lowestMarks){
            lowestMarks=marks[i];
        }
        if(marks[i]>=40){
            passed=passed+1;
        }
        else{
            failed=failed+1;
        }
       }
       System.out.println();
       double percentage= total/5.0;
       System.out.println("The Five Subjects Total Is: " + total);
       System.out.println("The Five Subjects Percentage  Is: " + percentage );
       System.out.println("The Highest Marks Is: " + highestMarks);
       System.out.println("The Lowest Marks Is: " + lowestMarks);
       System.out.println("The Number Of Subject Pass Is: " + passed);
       System.out.println("The Number Of Subjects failed Is: " + failed);
       sc.close();

    

    }
}
