//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student
{
	private String myName;
	private Grades myGrades;
	private double[] grades2;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		myName = name;
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades= new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return (double) getSum()/getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (double) (getSum()-getLowGrade())/(getNumGrades()-1.0);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public int compareTo(Student blah)
	{
		if (blah.getAverage() > this.getAverage())
		{
			return 1;
		}
		else if (blah.getAverage() < this.getAverage())
		{
			return 0;
		}
		else 
		{
			return 9;
		}
	}
	
	public boolean equals(Student blah)
	{
		if (blah.getAverage() == this.getAverage())
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return myName + " = " + myGrades;
	}	
}