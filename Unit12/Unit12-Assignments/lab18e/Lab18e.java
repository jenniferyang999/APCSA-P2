//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit12\\Unit12-Assignments\\Lab18e\\lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word2[] test = new Word2[size];
		int counter = 0;
		while (file.hasNext())
		{
			test[counter] = new Word2(file.next());
			counter++;
		}
				
		for (int i = 0; i < test.length; i++)
		{
			for (int j = 0; j < test.length; j++)
			{
				if (test[i].compareTo(test[j]) < 0)
				{
					Word2 temp;
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