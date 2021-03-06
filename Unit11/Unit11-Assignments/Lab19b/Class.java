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

public class Class
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Student> studentList;
	private Student student;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{	
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		student = s;
		/*for (int i = 0; i < studentList.size(); i++)
		{
			if (i == stuNum)
			{
				studentList.set(i, student);
			}
		}
		*/
		studentList.add(stuNum, student);

	}
	
	public String getClassName()
	{
	   return this.name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int j = 0; j < studentList.size(); j++)
		{
			classAverage = classAverage + getStudentAverage(j);			
		}
		return (double) (classAverage/studentList.size());
	}
	
	public double getStudentAverage(int stuNum)
	{
		for (int k = 0; k < studentList.size(); k++)
		{
			if (k == stuNum)
			{
				return studentList.get(k).getAverage();
			}
		}
		return 0.0;
	}

	public double getStudentAverage(String stuName)
	{
		for (int i = 0; i < studentList.size(); i++)
		{
			//student = studentList.get(i);
			//out.println("*****" + student + "******");
			//String thing = student.getName();
			if (studentList.get(i).getName().equals(stuName))
			{
				return getStudentAverage(i);
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		for (int i = 0; i < studentList.size(); i++)
		{
			//student = studentList[i];
			if (i == stuNum)
			{
				return studentList.get(i).getName();
			}
		}
		return "";
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName = "";

		/*for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			if (student.getAverage() >= high)
			{
				hName = student.getName();
				high = student.getAverage();
			}
		}
	*/
		sortStudentsLowtoHigh();
		hName = getStudentName(studentList.size() - 1);
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		/*
		for (int i = 0; i < arrayLength; i++)
		{
			student = studentList[i];
			if (student.getAverage() <= low)
			{
				hName= student.getName();
				low = student.getAverage();
			}
		}*/
		
		sortStudentsLowtoHigh();
		hName = getStudentName(0);
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		
		for (int i = 0; i < studentList.size(); i++)
		{
			//student = studentList[i];
			if (getStudentAverage(i) < failingGrade)
			{
				output = output + studentList.get(i).getName() + " ";
			}
		}
		return output;
	}
	
	public ArrayList<Student> sortStudentsLowtoHigh()
	{
		for(int i = 0; i < studentList.size(); i++) 
		{
			for(int j = 0; j < studentList.size()-1; j++) 
			{
				if(studentList.get(j).compareTo(studentList.get(j+1)) == 0) //if second one is less than first one == true
				{
					Student holdthing = studentList.get(j);
					studentList.set(j, studentList.get(j+1)); //moves second one lower
					studentList.set(j+1, holdthing);   //moves first one higher
				}
			}
		}
		return studentList;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i < studentList.size(); i++)
		{
			output = output + studentList.get(i) + " " + getStudentAverage(i) + "\n";
		}
		return output;
	}  	
}