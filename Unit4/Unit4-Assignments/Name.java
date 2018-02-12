//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private String first, last;

	public Name()
	{
		
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
	   int thing = s.indexOf(" ");  //for Sally Baker, thing = 5
	   first = s.substring(0, thing);
	   last = s.substring(thing + 1, s.length());
   }

	public String getFirst()
	{
		return first;
	}

	public String getLast()
	{
		return last;
	}

 	public String toString()
 	{
 		return name;
	}
}