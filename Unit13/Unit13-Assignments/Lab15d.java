//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit13\\Unit13-Assignments\\lab15d.dat"));
		
		int a = file.nextInt();
		String word = " ";
		FancyWords test = new FancyWords("");
		file.nextLine();
		for (int i = 0; i < a; i++)
		{
			word = word + file.nextLine();
			test = new FancyWords(word);
			out.println(test);
			word = " ";
		}
		
		
	}




}