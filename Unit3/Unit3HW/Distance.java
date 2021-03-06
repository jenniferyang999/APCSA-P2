//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance, xdif = 0.0, ydif = 0.0;

	public Distance()
	{

	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		xdif = xTwo - xOne;
		ydif = yTwo - yOne;
		distance = Math.sqrt(Math.pow(xdif, 2) + Math.pow(ydif, 2));
	}

	public void print( )
	{
		 System.out.println("distance == " + String.format("%.3f", distance));
	}
}