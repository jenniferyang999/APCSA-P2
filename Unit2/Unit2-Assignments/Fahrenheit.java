//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		double calc = 5/9.0;
		celsius = (fahrenheit - 32) * calc; 
		return celsius;
	}

	public void print()
	{
		System.out.println(String.format("%.2f", fahrenheit) + " degrees Fahrenheit == " + String.format("%.3f", getCelsius()) + " degrees Celsius");
		System.out.println();
	}
}