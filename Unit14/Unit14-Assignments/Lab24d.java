//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit14\\Unit14-Assignments\\lab24d.dat"));
		String word = "";
		TicTacToe test = new TicTacToe();
		
		int a = file.nextInt();
		file.nextLine();
		for (int i = 0; i < a; i++)
		{
			while (file.hasNext())
			{
				word = file.nextLine();
				test = new TicTacToe(word);
				test.getWinner();
				out.println(test);
			}
		}
 





	}
}



