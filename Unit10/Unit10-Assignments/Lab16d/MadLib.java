//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String filething; 
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();


	}

	public MadLib(String fileName)
	{
		this();
		filething = fileName;
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext())
			{
				String thing = file.next();
				if (thing.equals("#"))
				{
					out.print(getRandomNoun() + " ");
				}
				else if (thing.equals("@"))
				{
					out.print(getRandomVerb() + " ");
				}
				else if (thing.equals("&"))
				{
					out.print(getRandomAdjective() + " ");
				}
				else
				{
					out.print(thing + " ");
				}
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			
			Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit10\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while (file.hasNext()) {
				nouns.add(file.next());
			}
		
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");

		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit10\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (file.hasNext()) {
				verbs.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");

		}
	}

	public void loadAdjectives()
	{
		try{
	
			Scanner file = new Scanner(new File("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit10\\Unit10-Assignments\\Lab16d\\adjectives.dat"));	
			while (file.hasNext()) {
				adjectives.add(file.next());
			}
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");

		}
	}

	public String getRandomVerb()
	{
		double rand = (Math.random() * nouns.size()) + 1; 
		return verbs.get((int) rand);
	}
	
	public String getRandomNoun()
	{
		double rand = (Math.random() * nouns.size()) + 1; 
		return nouns.get((int) rand);
	}
	
	public String getRandomAdjective()
	{
		double rand = (Math.random() * nouns.size()) + 1; 
		return adjectives.get((int) rand);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}