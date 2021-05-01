/*

Write a Java program that takes a year from user and print whether that
year is a leap year or not. 
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year

*/
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.print(year + " is a leap year");
        }
        else{
            System.out.print(year + " is not a leap year");
        }
	}
}
