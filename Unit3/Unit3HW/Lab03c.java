//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
	int a = 0, b = 0, c = 0;
	Scanner userinput = new Scanner(System.in);

	Quadratic test = new Quadratic(a, b, c);

	System.out.print("Enter a: ");
	a = userinput.nextInt();	
	System.out.print("Enter b: ");
	b = userinput.nextInt();	
	System.out.print("Enter c: ");
	c = userinput.nextInt();
	System.out.println();
	System.out.println(a + "x^2 + (" + b + "x) + " + c + " = 0");
	System.out.println();

	test.setEquation(a, b, c);
	test.calcRoots();
	test.print();
	
	Quadratic test1 = new Quadratic(a, b, c);

	System.out.print("Enter a: ");
	a = userinput.nextInt();	
	System.out.print("Enter b: ");
	b = userinput.nextInt();	
	System.out.print("Enter c: ");
	c = userinput.nextInt();
	System.out.println();
	System.out.println(a + "x^2 + (" + b + "x) + " + c + " = 0");
	System.out.println();

	test1.setEquation(a, b, c);
	test1.calcRoots();
	test1.print();
	
	Quadratic test2 = new Quadratic(a, b, c);

	System.out.print("Enter a: ");
	a = userinput.nextInt();	
	System.out.print("Enter b: ");
	b = userinput.nextInt();	
	System.out.print("Enter c: ");
	c = userinput.nextInt();
	System.out.println();
	System.out.println(a + "x^2 + (" + b + "x) + " + c + " = 0");
	System.out.println();

	test2.setEquation(a, b, c);
	test2.calcRoots();
	test2.print();
		
	//5, 7, 2
	//5, -8, 3
	//2, 9, 3
   }
}