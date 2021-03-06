//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;


public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		out.println();
		out.println();
		
		Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit11\\Unit11-Assignments\\Lab19b\\gradebook.dat"));

		String thing = file.nextLine();
		int blah = file.nextInt();
		ArrayList<Class> c = new ArrayList<Class>();
		Class test = new Class(thing,blah);
		c.add(test);

		file.nextLine();

		for (int i = 0; i < blah; i++)
		{
			String thing1 = file.nextLine();
			String thing2 = file.nextLine();
			Student student = new Student(thing1, thing2);
			c.get(0).addStudent(i, student);
		}
		
		c.get(0).sortStudentsLowtoHigh();
		out.print(c.get(0));

		out.println();
		out.println("Failure List = " + c.get(0).getFailureList(70.00));
		out.println("Highest Average = " + c.get(0).getStudentWithHighestAverage());
		out.println("Lowest Average = " + c.get(0).getStudentWithLowestAverage());
		out.println("Class Average = " + c.get(0).getClassAverage());

	}		
}