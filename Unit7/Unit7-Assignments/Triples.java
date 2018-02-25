//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.lang.Math;


public class Triples
{
   private int number=1, p1, p2, p3;

	public Triples()
	{
		//this(0); //calls another method in here 	
	}

	public Triples(int num)
	{
		number = num;
		this.setNum(number);
	}

	public void setNum(int num)
	{
		number = num;
		/*Random test = new Random();
		int r1 = test.nextInt(number);
		int r2 = test.nextInt(number);
		int r3 = test.nextInt(number);
		if (r1 > r2 && r1 > r3) {
			p3 = r1;
			if (r3 > r2) {
				p2 = r3;
				p1 = r2;
			}
			else {
				p3 = r2;
				p2 = r3;
			}
		}
		else if (r2 > r3 && r2 > r1) {
			p3 = r2;
			if (r3 > r1) {
				p2 = r3;
				p1 = r1;
			}
			else {
				p2 = r1;
				p1 = r3;
			}
		}
		else if (r3 > r2 && r3 > r1) {
			p3 = r3;
			if (r2 > r1) {
				p2 = r2;
				p1 = r1;
			}
			else {
				p2 = r1;
				p1 = r2;
			}
		}
		*/
		
	} 
	
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		return greatestCF2(greatestCF2(a, b), c);
	}
	private int greatestCF2(int a, int b)
		{	
		//int max = 0;

	   while ((a != 0 && b != 0))
       {
		  if (b >= a)
	      {
			  b = b - a;
	      }
          else {
        	  a = a - b;
          }
       }
       if (a == 0) 
       {
	     return b;
       }
       else 
       {
     	  return a;
       }
	}

	public String toString()
	{
		String output="";
	
		  for (int i = 1; i <= number; i++)
		  {
			  for (int j = i + 1; j <= number; j++)
			  { 
				  for (int k = j + 1; k <= number; k++)
				  {
			        if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && greatestCommonFactor(i,j,k) == 1) 
			        {
			        	output = output + i + " " + j + " " + k + "\n";
			        }
			      }
			  }
		  	}
		return output + "\n";
	}
}