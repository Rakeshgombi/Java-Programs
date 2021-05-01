/*

Write a Java program to find the number of days in a month. 
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days

*/

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        String NameOfMonth = "Unknown month";
        int NoOfDays = 0;
        switch(month){
        case 1:
            NameOfMonth = "January";
            NoOfDays = 31;
            break;
        case 2:
            NameOfMonth = "February";
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
               NoOfDays = 29;
                }
            else{
                NoOfDays = 28;
                }
            break;
        case 3:
            NameOfMonth = "March";
            NoOfDays = 31;
            break;
        case 4:
            NameOfMonth = "April";
            NoOfDays = 30;
            break;
        case 5:
            NameOfMonth = "May";
            NoOfDays = 31;
            break;
        case 6:
            NameOfMonth = "June";
            NoOfDays = 30;
            break;
        case 7:
            NameOfMonth = "July";
            NoOfDays = 31;
            break;
        case 8:
            NameOfMonth = "August";
            NoOfDays = 31;
            break;
        case 9:
            NameOfMonth = "September";
            NoOfDays = 30;
            break;
        case 10:
            NameOfMonth = "October";
            NoOfDays = 31;
            break;
        case 11:
            NameOfMonth = "November";
            NoOfDays = 30;
            break;
        case 12:
            NameOfMonth = "December";
            NoOfDays = 31;
            break;
        default:
             System.out.println("Invalid month or year");
	}
    System.out.println(NameOfMonth + " of year " + year + " has " + NoOfDays + " Days");
    }
}
