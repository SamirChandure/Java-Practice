import java.util.Scanner;
public class Problem_73 {
    static int  getTotal(int sub1, int sub2, int sub3, int sub4, int sub5){
        int total=sub1+sub2+sub3+sub4+sub5;
        return total;
    }
    static double getPercentage(int total){
        double percentage=(total/5.0);
        return percentage;
    }
    static char grade(double percentage){
        if(percentage>=90){
            return 'A';
        }
        else if(percentage>=80 && percentage<90){
            return 'B';
        }
        else if(percentage>=70 && percentage<80){
            return 'C';
        }
        else if(percentage<=35){
            return 'E';
        }
        return  'z'  ;
        }
    static void displayResult(int total, double percentage, char grade){
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter The Sub1 Marks: ");
        int sub1=sc.nextInt();
        System.out.print("Enter The Sub2 Marks: ");
        int sub2=sc.nextInt();
        System.out.print("Enter The Sub3 Marks: ");
        int sub3=sc.nextInt();
        System.out.print("Enter The Sub4 Marks: ");
        int sub4=sc.nextInt();
        System.out.print("Enter The Sub5 Marks: ");
        int sub5=sc.nextInt();
        int total=getTotal(sub1, sub2, sub3, sub4, sub5);
        double percentage=getPercentage(total);
        char grade=grade(percentage);
        displayResult(total, percentage, grade);
        sc.close();


    }   

        
    }



