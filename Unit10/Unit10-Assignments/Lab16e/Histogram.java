//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName, check;
	private int counter;
	private char[] charvalues;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{		
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		charvalues = values;
		fileName = fName;
		for (int i = 0; i < charvalues.length; i++)
		{ 
			letters.add(charvalues[i]);
		}

		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		if (fileName.equals("lab16e1.dat")){
			Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit10\\Unit10-Assignments\\Lab16e\\lab16e1.dat"));
			check = "";
			while (file.hasNext()) {
				check = check + file.next();
			}
			for (int i = 0; i < letters.size(); i++)  //goes through all values of letters
			{						
				counter = 0;
				Character thing3 = letters.get(i);
				for (int j = 0; j < check.length(); j++) //goes through all letters in file
				{
					char thing = check.charAt(j);
				    Character c1 = new Character(thing);
				    					
					if (thing3.equals(c1))
					{
						counter = counter + 1;
					}
				}
				count.add(counter);
			}
		}
		
		else if (fileName.equals("lab16e2.dat")){
			Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit10\\Unit10-Assignments\\Lab16e\\lab16e2.dat"));
			check = "";
			while (file.hasNext()) {
				check = check + file.next();
			}
			for (int i = 0; i < letters.size(); i++)  //goes through all values of letters
			{						
				counter = 0;
				Character thing3 = letters.get(i);
				for (int j = 0; j < check.length(); j++) //goes through all letters in file
				{
					char thing = check.charAt(j);
				    Character c1 = new Character(thing);
				    					
					if (thing3.equals(c1))
					{
						counter = counter + 1;
					}
				}
				count.add(counter);
			}
		}
		
		else if (fileName.equals("lab16e3.dat")){
			Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit10\\Unit10-Assignments\\Lab16e\\lab16e3.dat"));
			check = "";
			while (file.hasNext()) {
				check = check + file.next();
			}
			for (int i = 0; i < letters.size(); i++)  //goes through all values of letters
			{						
				counter = 0;
				Character thing3 = letters.get(i);
				for (int j = 0; j < check.length(); j++) //goes through all letters in file
				{
					char thing = check.charAt(j);
				    Character c1 = new Character(thing);
				    					
					if (thing3.equals(c1))
					{
						counter = counter + 1;
					}
				}
				count.add(counter);
			}
		}
	}

	public char mostFrequent()
	{
		int numb = 0;
		for (int k = 0; k < count.size(); k++)
		{
			if (count.get(k) >= count.get(numb))
			{
				numb = k;
			}
		}
		return letters.get(numb);
	}

	public char leastFrequent()
	{
		int numb = 0;
		for (int k = 0; k < count.size(); k++)
		{
			if (count.get(k) <= count.get(numb))
			{
				numb = k;
			}
		}
		return letters.get(numb);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}