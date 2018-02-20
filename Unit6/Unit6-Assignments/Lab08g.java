//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats(1, 5);
		test.getOddCount();
		test.getEvenCount();
		out.println(test);
		
		LoopStats test1 = new LoopStats(2, 9);
		test1.getOddCount();
		test1.getEvenCount();
		out.println(test1);
		
		LoopStats test2 = new LoopStats(23, 78);
		test2.getOddCount();
		test2.getEvenCount();
		out.println(test2);					
	}
}