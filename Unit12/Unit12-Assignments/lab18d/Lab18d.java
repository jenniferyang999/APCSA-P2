//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit12\\Unit12-Assignments\\Lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] test = new Word[size]; //test == array of Words of length size
		int counter = 0;
		while (file.hasNext()) //puts file's words into array
		{
			test[counter] = new Word(file.next());
			counter++;
		}
		
		for (int i = 0; i < test.length; i++)
		{
			for (int j = 0; j < test.length; j++)
			{
				if (test[i].compareTo(test[j]) < 0)
				{
					Word temp;
					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < test.length; i++)
		{
			out.println(test[i]);
		}

	}
	
	
}