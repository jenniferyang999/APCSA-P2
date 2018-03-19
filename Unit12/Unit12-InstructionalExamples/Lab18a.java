//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab18a
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		
		//instantiate monster one
		
		
		//ask for name and size
		
		//instantiate monster two

		
		
		
		//© A+ Computer Science  -  www.apluscompsci.com
		//Name -
		//Date -
		//Class -
		//Lab  -

		import java.io.File;
		import java.io.IOException;
		import java.util.ArrayList;
		import java.util.Scanner;
		import java.util.Arrays;
		import static java.lang.System.*;

		public class Lab18e
		{
			public static void main( String args[] ) throws IOException
			{
				Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit12\\Unit12-Assignments\\Lab18e\\lab18e.dat"));

				int size = file.nextInt();
				file.nextLine();
				
				Word2[] test = new Word2[size];
				int counter = 0;
				while (file.hasNext()) //puts file's words into array
				{
					test[counter] = new Word2(file.next());
					counter++;
				}


			}
		}	
		
		
		
		
		//© A+ Computer Science  -  www.apluscompsci.com
		//Name -
		//Date -
		//Class -
		//Lab  -

		import static java.lang.System.*;

		public class Word2 implements Comparable<Word2>
		{
			private String word;

			public Word2( String s)
			{
				word = s;
			}

			private int numVowels()
			{
				String vowels = "AEIOUaeiou";
				
				String[] arrayVowels = new String[9];
				for (int i = 0; i < vowels.length() - 1; i++)
				{
					arrayVowels[i] = String.valueOf(i);
					out.println(arrayVowels[i]);
				}
				/*for (String x : arrayVowels)
				{
					if word.contains(x)
				}
				*/
				int vowelCount=0;
				for (int i = 0; i < vowels.length(); i++)
				{
					if (word.contains(vowels[i]))
					{
						vowelCount++;
					}
				}

				return vowelCount;
			}

			public int compareTo(Word rhs)
			{



			
				return -1;
			}

			public String toString()
			{
				return word;
			}

			@Override
			public int compareTo(Word2 o) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}