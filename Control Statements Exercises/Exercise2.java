/*

Write a Java program that reads in two floating-point numbers and tests
whether they are the same up to three decimal places. 
Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different

*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  // Write your code here
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number 1: ");
  float num1 = sc.nextFloat();
  System.out.print("\nEnter number 2: ");
  float num2 = sc.nextFloat();
  
  float x = Math.round(num1 * 1000);
  System.out.println(x);
  x = x / 1000;
  System.out.println(x);

  float y = Math.round(num2 * 1000);
  y = y / 1000;
  
  if (x == y){
      System.out.print("They are same");
  }
  else{
      System.out.print("They are different");
  }
 }
}
