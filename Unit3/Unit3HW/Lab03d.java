//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		int a = 0, b = 0, c = 0, d = 0;
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter X1: ");
		a = userinput.nextInt();
		System.out.print("Enter Y1: ");
		b = userinput.nextInt();
		System.out.print("Enter X2: ");
		c = userinput.nextInt();
		System.out.print("Enter Y2: ");
		d = userinput.nextInt();
		
		Distance test = new Distance();
		test.setCoordinates(a, b, c, d);
		test.calcDistance();
		test.print();
		System.out.println();
		
		System.out.print("Enter X1: ");
		a = userinput.nextInt();
		System.out.print("Enter Y1: ");
		b = userinput.nextInt();
		System.out.print("Enter X2: ");
		c = userinput.nextInt();
		System.out.print("Enter Y2: ");
		d = userinput.nextInt();
		
		Distance test1 = new Distance(a, b, c, d);
		test1.calcDistance();
		test1.print();
		System.out.println();
		
		System.out.print("Enter X1: ");
		a = userinput.nextInt();
		System.out.print("Enter Y1: ");
		b = userinput.nextInt();
		System.out.print("Enter X2: ");
		c = userinput.nextInt();
		System.out.print("Enter Y2: ");
		d = userinput.nextInt();
		
		Distance test2 = new Distance();
		test2.setCoordinates(a, b, c, d);
		test2.calcDistance();
		test2.print();					
	}
}