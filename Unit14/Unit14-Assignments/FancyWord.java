//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	private String word;

	public FancyWord()
	{

	
	}

   public FancyWord(String s)
	{
	   word = s;
	   mat = new char[word.length()][word.length()];
	   //Scanner keyboard = new Scanner(word);
  
	   for (int i = 0; i < word.length(); i++)
	   {
				mat[0][i] = word.charAt(i);
	   }
	  
	   for (int j = 1; j < word.length() - 1; j++)
	   {
			mat[j][j] = word.charAt(j);
			mat[word.length() - j - 1][j] = word.charAt(j);
	   }
	   
	   for (int k = 0; k < word.length(); k++)
	   {
		   mat[word.length()-1][k] = word.charAt(k);
	   }
}
	

	public String toString()
	{
		String output="";
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[0].length; j++)
			{
				output = output + mat[i][j] ;
			}
			output = output + "\n";
		}
		


		return output+"\n\n";
	}
}