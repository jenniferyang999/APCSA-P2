//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;
	private String[] tempRay;
	private String word;
	private int counter = 0;

	public FancyWords(String sentence)
	{
		word = sentence;
		setWords(word);
	}

	public void setWords(String sentence)
	{
		word = sentence;
		Scanner keyboard = new Scanner(word);
		while (keyboard.hasNext())
		{
			counter++;
			keyboard.next();

		}
		wordRay = new String[counter];
		counter = 0;
		keyboard = new Scanner(word);
		while (keyboard.hasNext())
		{
			wordRay[counter] = keyboard.next();
			counter++;
			/*for (int j = 0; j < tempRay.length; j++)
			{
				tempRay[j] = wordRay[j];
			}
			tempRay = new String[count + 1];
			*/
			
			//out.println(wordRay[i]);
		}
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < wordRay.length; i++)
		{
			if (wordRay[i].length() > max)
			{
				max = wordRay[i].length();
			}
		}
		
		for (int j = 0; j < max; j++)
		{
			for (int k = wordRay.length - 1; k >= 0; k--)
			{
				if (wordRay[k].length() > j)
				{
					output = output + wordRay[k].charAt(wordRay[k].length() - 1 - j);

				}
				else
				{
					output = output + " ";
				}
			}
			output = output + "\n";
		}
		
		/*for (int i = wordRay.length - 1; i >= 0; i--)
		{
			int numb = wordRay[i].length() -1; 
			while (numb >=0)
			{
				output = output + wordRay[i].charAt(numb) + "";
				numb = numb - 1;

			}
			output = output + "\n";
		}*/

		return output+"\n\n";
	}
}