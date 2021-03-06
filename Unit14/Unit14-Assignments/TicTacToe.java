//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;
	private int size, size1, size2;
	private boolean x = false, o = false;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int counter = 0;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				mat[i][j] = game.charAt(counter);
				counter++;
			}
		}
	}

	public String getWinner()
	{
		size = 0;
		size1 = 0;
		size2 = 0;
		for (int i = 0; i < 3; i++)
		{
			if (mat[0][i] == 'X')
			{
				size++;
				if (size == 3)
				{
					return "X wins diagonally";
				}
			}
			if (mat[i][0] == 'X')
			{
				size1++;
				if (size1 == 3)
				{
					return "X wins vertically";
				}
			}
			if (mat[i][i] == 'X')
			{
				size2++;
				if (size2 == 3)
				{
					return "X wins horizontally";
				}
			}
		}
		/*
		size = 0;
		size1 = 0;
		size2 = 0;
		for (int i = 0; i < 3; i++)
		{
						
			if (mat[0][i] == 'O')
			{
				size++;
				if (size == 3)
				{
					return "O wins horizontally";
				}
			}
			
			if (mat[i][0] == 'O')
			{
				size1++;
				if (size1 == 3)
				{
					return "O wins vertically";
				}
			}
			if (mat[i][i] == 'O')
			{
				size2++;
				if (size2 == 3)
				{
					return "O wins diagonally";
				}
			}
			*/
		
		
		return "cat's game - no winner";
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				output = output + mat[i][j];
			}
			output = output + "\n";
		}





		return output+"\n\n";
	}
}