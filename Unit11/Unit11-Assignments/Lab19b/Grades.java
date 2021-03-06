//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{	
	//private double[] grades;
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner idea = new Scanner(gradeList);
		/*if (idea.hasNext())
		{
			int la = idea.nextInt();
			grades = new double[la];

		}
		*/
		grades = new ArrayList<Double>();
		if (idea.hasNext())
		{
			idea.next();
		}
		/*for (int j = 0; j < grades.size(); j++)
		{
			
			grades.s(idea.nextDouble());

		}*/
		while (idea.hasNextDouble())
		{
			grades.add(idea.nextDouble());
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		//size = grades[0];
		double sum=0.0;
		for (int i = 0; i < grades.size(); i++)
		{
			sum = sum + grades.get(i);
		}
		
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i) <= low)
			{
				low = grades.get(i);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i) >= high)
			{
				high = grades.get(i);
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for (int i = 0; i < grades.size(); i++){
			output = output + grades.get(i) + " ";
		}
		return output;
	}	
}