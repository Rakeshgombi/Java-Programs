/*

Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday

*/


import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
        }
	}
}
