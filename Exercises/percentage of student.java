import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        System.out.println("Percentage of CBSE Students");
        Scanner s = new Scanner(System.in);
        System.out.println("Total Marks in a subject: ");
        
        int totMarks = 5 * 100;
        System.out.println("subject 1: ");
        int sub1 = s.nextInt();
        System.out.println("subject 2: ");
        int sub2 = s.nextInt();
        System.out.println("subject 3: ");
        int sub3 = s.nextInt();
        System.out.println("subject 4: ");
        int sub4 = s.nextInt();
        System.out.println("subject 5: ");
        int sub5 = s.nextInt();
        float per = ((sub1 + sub2 + sub3 + sub4 + sub5)*100) / totMarks;
        System.out.println("Percentage is: ");
        System.out.print(per);
    }
}