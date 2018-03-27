//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exit = false;
   
	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner keyboard = new Scanner(line);
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze.length; j++)
			{
				maze[i][j] = keyboard.nextInt();
			}
		}
	}

	public void hasExitPath(int r, int c)
	{			
		if (r>=0 && r<maze.length && c>=0 && c<maze.length && maze[r][c] == 1)
		{
			maze[r][c] = 9;

			if (c + 1 == maze.length)
			{
				exit = true;
				//maze[r][c+1] = 9;
			}
			else
			{
				hasExitPath(r-1, c);
				hasExitPath(r+1, c);
				hasExitPath(r, c-1);
				hasExitPath(r, c+1);
			}
			maze[r][c] = 1;

		}
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze.length; j++)
			{
				output = output + maze[i][j] + " ";
			}
			output = output + "\n";
		}
		
		if (exit)
		{
			output = output + "exit found\n";
		}
		else
		{
			output = output + "exit not found\n";
		}
		return output;
	}
}