//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{

	public static void main(String args[])
	{
		String ans;
		Scanner keyboard = new Scanner(System.in);
		out.print("Guessing Game - How many numbers? ");
		int response = keyboard.nextInt();
		GuessingGame test = new GuessingGame(response);
		test.playGame();
		out.println(test);
		
			do {	
				out.print("Do you want to play again? (y/n) ");
				ans = keyboard.next();
				if (ans.equals("y")) {
					out.print("Guessing Game - How many numbers? ");
					response = keyboard.nextInt();
					GuessingGame test2 = new GuessingGame(response);
					test2.playGame();
					out.println(test2);
				}
			} while (ans.equals("y"));
		keyboard.close();
	}
}