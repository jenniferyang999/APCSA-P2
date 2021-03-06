//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modifiers
	public void add( String  word)
	{
		int loc = 0;
		if (list.contains(word))
		{
			return;
		}
		else
		{
			loc = Collections.binarySearch(list, word); //returns -1 - shouldbelocation
			out.println(loc);
			if (loc < 0)
			{
				list.add(Math.abs(loc+1),word);
			}
		}
	}


	public void remove(String word)
	{
		int loc = 0;
		loc = Collections.binarySearch(list, word);
		if (loc >= 0)
		{
			list.remove(word);
		}
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < list.size(); i++)
		{
			output = output + list.get(i) + " ";
		}
		return output;

	}
}