/*

Write a program in Java to display the cube of the number upto given
an integer. 
Test Data
Input number of terms : 4
Expected Output :

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            System.out.println("Number is : " + i + " and cube of 1 is : " + i*i*i);
        }
    }
}
