//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab21g
{
	public static void main(String args[])
	{
		String answer;
		//instantiate an AtCounter
		AtCounter test = new AtCounter();
		
		//test the code
		do {
		Scanner keyboard = new Scanner(System.in);
		out.print("Row: ");
		int a = keyboard.nextInt();
		out.print("Column: ");
		int b = keyboard.nextInt();
		
		test.countAts(a, b);
		out.println(a + " " + b + " has " + test);
		out.println();
		out.print("Would you like to test another spot? (y/n) ");
		answer = keyboard.next();
		} while (answer.equals("y"));
	}
}