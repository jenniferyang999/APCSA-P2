//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private int amount;
	private double[] array = {0.0};

	
	public Grades() 
	{
		setAmount(3);
		this.setArray();
	}
	public Grades(int a)
	{
		amount = a;
		this.setArray();
		
	}

	public void setAmount(int a)
	{
		/*Scanner keyboard = new Scanner(System.in);
		out.print("How many grades do you have? ");
		amount = keyboard.next(); */
		amount = a;
	}
	
	public double[] setArray()
	{
		array = new double[amount];
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < amount; i++) 
		{
			out.print("grade " + i + " : : ");
			array[i] = keyboard.nextDouble();			
		}
		return array;
	}


	private double getSum()
	{
		double sum=0.0;
		for (double item : array) 
		{
			sum = sum + item;
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / amount;
		return average;
	}


	public String toString()
	{
		String s = "";
		s = "\naverage = " + getAverage();
		return s;
	}


}