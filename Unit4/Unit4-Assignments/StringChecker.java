//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;
	private int check1, check2;

	public StringChecker()
	{

	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
	    word=s;
   }

	public boolean findLetter(char c)
	{
		check1 = word.indexOf(c);
		if (check1 != -1) {
			return true;
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		check2 = word.indexOf(s);
		if (check2 != -1) {
			return true;
		}
		return false;
	}

 	public String toString()
 	{
 		out.println(word);
 		return "\n";
	}
}