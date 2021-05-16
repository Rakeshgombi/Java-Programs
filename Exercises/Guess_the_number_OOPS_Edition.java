/*

Create a class Game, which allows user to play "Guess The Number"
game once
game should have the following methods:
1) Constructor to generate the random number
2) takeUserInput()
9) isCorrectNumber() to detect whether the number entered by the user is true
5) getters and setters for noOfGuesses
Use Properties such as numberOfGuesses(int), etc  to get this tast done

*/

import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int noOfGuesses = 0;
    public int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

   Game(){
       Random rand = new Random();
       this.number = rand.nextInt(100);
   }
   void takeUserInput(){
       System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
   }

   boolean isCorrectNumber(){
       noOfGuesses++;
       if (inputNumber == number){
           System.out.printf("Yes you Guessed right it was %d you guessed it in %d attempts", number, noOfGuesses);
           return true;
       }
       else if (inputNumber < number){
           System.out.println("Too Low...");
       }
       else if (inputNumber > number){
           System.out.println("Too High...");
       }
        return false;

   }
}


public class Main
{
	public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
		g.takeUserInput();
        b = g.isCorrectNumber();
        }
	}
}
