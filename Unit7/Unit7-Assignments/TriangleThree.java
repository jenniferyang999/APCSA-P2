//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size, numb;
   private String letter, output;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
		
	}

	public String getLetter()
	{
		numb = size - 1;
		output="";
		for (int i = 1; i <= size; i++)
		{
		   for (int j = 1; j <= numb; j++) 
		   {
		       output = output + " ";  //if numb == 6 --> j: 123456 12345 1234 123 12 1

		   }   
		   for (int k = 1; k <= i; k++)
		   {   
		       output = output + letter;
		   }   
		   numb = numb - 1;
		   
		  output = output + "\n";
		}
		return output;
	}

	public String toString()
	{
		return getLetter();
	}
}