//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number, count = 0;
	private String output;

	public Prime()
	{


	}

	public Prime(int num)
	{
		number = num;
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		for (double i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				count = count + 2; //if divisible by one #, then must be divisible by the corresponding number to #, therefore 2
			}
		}
		if (count > 2) {
			return false;
		}
		else {
			return true;
		}
	}

	public String toString()
	{
		if (isPrime() == false) {
			output = number + " is not a prime.";
		}
		else {
			output = number + " is a prime.";
		}
		return output;
	}
}