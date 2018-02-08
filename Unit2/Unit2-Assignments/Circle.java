//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;
		
	public void setRadius(double rad)
	{
		radius = rad;		
	}

	public void calculateArea()
	{
		double a = radius * radius * 3.14159265;
		area = a;
		
	}

	public void print( )
	{
		System.out.println("The area is : : " + area);
		System.out.println("");
		
	}
}
