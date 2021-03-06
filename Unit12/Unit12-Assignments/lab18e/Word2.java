//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		char[] array = new char[10];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = vowels.charAt(i);
		}
		int vowelCount=0;
		
		for (int j = 0; j < word.length(); j++)
		{
			for (int k = 0; k < array.length; k++)
			{
				if (word.charAt(j) == array[k])
				{
					vowelCount++;
				}
			}
		}

		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		Word2 thing = (Word2)rhs;
		if (numVowels() > thing.numVowels())
		{
			return 1;
		}
		else if (numVowels() < thing.numVowels())
		{
			return -1;
		}
		else 
		{
			return word.compareTo(rhs.word);
		}
	}

	public String toString()
	{
		return word;
	}
}