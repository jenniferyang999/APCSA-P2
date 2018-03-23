//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		Word thing = (Word)rhs;
		if (word.length() > thing.word.length())
		{
			return 1;
		}
		else if (word.length() < thing.word.length())
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