//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("fdsakkjghdfj", 'j');
		out.println(test);
		test.removeLetters();
		
		LetterRemover test1 = new LetterRemover("scrumptious", 's');
		out.println(test1);
		test1.removeLetters();
		
		LetterRemover test2 = new LetterRemover("harrypotter", 'r');
		out.println(test2);
		test2.removeLetters();
	}
}