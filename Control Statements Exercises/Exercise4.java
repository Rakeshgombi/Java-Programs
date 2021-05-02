/*

Write a Java program that takes the user to provide a single character
from the alphabet. Print Vowel or Consonant, depending on the user
input. If the user input is not a letter (between a and z or A and Z), or is
a string of length &gt; 1, print an error message. 
Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant

*/

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String alphabet = sc.next();

        String input = sc.next();
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if(!(uppercase || lowercase)){
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (input.equalsIgnoreCase("a") ||input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i") ||input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")){
            System.out.println("Input is a Vowel");
        }
        else{
            System.out.println("Input is a Consonant");
        }

	}
}
