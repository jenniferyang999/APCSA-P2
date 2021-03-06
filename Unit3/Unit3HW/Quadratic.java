//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	private double top1, top2 = 0.0;
	private double bottom1, bottom2 = 0.0;

	public Quadratic()
	{
	
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		
		top1  = -b + Math.sqrt((Math.pow(b, 2)) - (4.0 * a * c));
		top2  = -b - Math.sqrt((Math.pow(b, 2)) - (4.0 * a * c));
		bottom1 = 2.0 * a;
		bottom2 = 2.0 * a;
 	}

	public void calcRoots()
	{
		rootOne = top1 / bottom1;
		rootTwo = top2 / bottom2;

	}

	public void print( )
	{

		System.out.println("rootone : :  " + String.format("%.2f", rootOne));
		System.out.println("roottwo : :  " + String.format("%.2f", rootTwo));
		System.out.println();

	}
}