//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04d
{
	public static void main ( String[] args )
	{
		Name person = new Name("Sally Baker");
		person.setName("Sally Baker");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
		System.out.println();

		person.setName("John Doe");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
		System.out.println();


		person.setName("Sammy Lammy");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
		System.out.println();


		person.setName("Benny Programmer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
		System.out.println();


		person.setName("Sandy Painter");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
	}
}