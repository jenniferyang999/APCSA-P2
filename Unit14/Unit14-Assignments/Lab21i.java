//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit14\\Unit14-Assignments\\lab21i.dat"));
		Maze test = new Maze();
		while (file.hasNext())
		{
			int a = file.nextInt();
			file.nextLine();
			String b = file.nextLine();
			test = new Maze(a, b);
			test.hasExitPath(0, 0);
			out.println(test);
		}
	}
}