//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	private int arrayLength;
	private Student student;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{	
		this.name = name;
		arrayLength = stuCount;		
		studentList = new Student[arrayLength];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		student = s;
		for (int i = 0; i < arrayLength; i++)
		{
			if (i == stuNum)
			{
				studentList[i] = student;
			}
		}
	}
	
	public String getClassName()
	{
	   return this.name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int j = 0; j < arrayLength; j++)
		{
			classAverage = classAverage + getStudentAverage(j);			
		}
		return (double) (classAverage/arrayLength);
	}
	
	public double getStudentAverage(int stuNum)
	{
		for (int k = 0; k < arrayLength; k++)
		{
			if (k == stuNum)
			{
				return getStudentAverage(getStudentName(stuNum));
			}
		}
		return 0.0;
	}

	public double getStudentAverage(String stuName)
	{
		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			//out.println("*****" + student + "******");
			String thing = student.getName();
			if (thing.equals(stuName))
			{
				return student.getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			if (i == stuNum)
			{
				return student.getName();
			}
		}
		return "";
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName = "";

		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			if (student.getAverage() >= high)
			{
				hName = student.getName();
				high = student.getAverage();
			}
		}
		
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		

		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			if (student.getAverage() <= low)
			{
				hName= student.getName();
				low = student.getAverage();
			}
		}
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		
		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			if (student.getAverage() < failingGrade)
			{
				output = output + student.getName() + " ";
			}
		}
		return output;
	}
	
	public Student[] sortStudentsLowtoHigh()
	{
		for(int i = 0; i < studentList.length; i++) 
		{
			for(int j = 0; j < studentList.length-1; j++) 
			{
				if(studentList[j].compareTo(studentList[j+1]) == 0) //if second one is less than first one == true
				{
					Student holdthing = studentList[j];
					studentList[j] = studentList[j+1]; //moves second one lower
					studentList[j+1] = holdthing;   //moves first one higher
				}
			}
		}
		return studentList;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			output = output + student + "\t " + student.getAverage() + "\n";
		}
		return output;
	}  	
}