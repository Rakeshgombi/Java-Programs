/*

Write a program in Java to display the multiplication table of a
given integer. 
Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
