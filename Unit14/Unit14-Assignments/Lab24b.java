//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit14\\Unit14-Assignments\\lab24b.dat"));
		int size = file.nextInt();
		String word = "";
		file.nextLine();

		for(int i = 0; i < size; i++)
		{
			word = file.next();
			FancyWord test = new FancyWord(word);
			out.println(test);
	    }

		

			
		
	
	}
}