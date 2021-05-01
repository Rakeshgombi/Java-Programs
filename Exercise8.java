/*

Write a program in Java to input 5 numbers from keyboard and find their
sum and average. 
Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0

*/

		
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Input Number of Inputs: ");
        int n = sc.nextInt();
        int sum = 0, a;
        float avg = 0;
        for(int i = 0; i<n; i++){
            a = sc.nextInt();
            sum += a;
        }
        avg = sum / n;
        System.out.println("The sum of " + n + " no is : " + sum);
        System.out.println("The average is : " + avg);
	}
}
