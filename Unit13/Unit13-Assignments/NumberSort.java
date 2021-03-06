//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private int numb;
	
	public NumberSort (int n)
	{
		numb = n;
	}
	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0)
		{
			 number = number / 10;
			 count++;
		}

		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		sorted = new int[getNumDigits(number)];
		int numb = sorted.length - 1;
		int counter = 0;
		
		while (numb >= 0)
		{
			sorted[counter] = number % 10;
			number = number / 10;
			counter++;
			numb--;
		}
		
		for (int i = 0; i < sorted.length; i++)
		{
			for (int j = 0; j < sorted.length; j++)
			{
				if (sorted[i] < sorted[j])
				{
					int temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
				}
			}
		}

		return sorted;
	}
}