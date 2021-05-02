/*

Write a program in Java to display n terms of natural numbers and their sum.

Test Data
Input number: 7
Output:
Input number: 7                                                                                               
The first n natural numbers are : 7                                                                           
1                                                                                                     
2                                                                                                     
3                                                                                                     
4                                                                                                     
5                                                                                                     
6                                                                                                     
7                                                                                                     
The Sum of Natural Number upto n terms : 28 
*/

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
	}
}
