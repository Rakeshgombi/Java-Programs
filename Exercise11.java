/*

Write a program in Java to display the n terms of odd natural number and their sum. Go to the editor

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num, sum = 0;

        for(int i = 0; i < n; i++){
            num = (2*i) + 1;
            System.out.println(num);
            sum += num;
        }
        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);
    }
}
