//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private double rand, guess = 0, count = 0;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		rand = (int) ((Math.random() * upperBound) + 1);
		out.print("Enter a number between 1 and " + upperBound + " ");
		guess = keyboard.nextInt();
		count = count + 1;
		if (guess != rand) {
			if (guess > upperBound || guess < 1)
			{
				out.println("Number out of range!");	
			}
			
			do {
				out.print("Enter a number between 1 and " + upperBound + " ");
				guess = keyboard.nextInt();
				if (guess > upperBound || guess < 1) {
					out.println("Number out of range!");
				} 
				else {
					count = count + 1;
				}
			} while (guess != rand);
		}
		else {
			count = 1;
		}
		
	}	

	public String toString()
	{
		String output;
		if (count == 1) {
			output="\nIt took " + count + " guesses to guess " + rand + ". \nYou guessed wrong 0.00 percent of the time.\n";
		}
		else {
			output="\nIt took " + count + " guesses to guess " + rand + ". \nYou guessed wrong " + String.format("%.2f", (count - 1)/count * 100) + " percent of the time.\n";
		}
		return output;
	}
}