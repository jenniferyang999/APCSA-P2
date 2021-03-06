//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private int test;
	
	public CharacterAnalyzer()
	{
		
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		test = theChar;
		if (test <= 90 && test >= 65) {
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		test = theChar;
		if (test <= 122 && test >= 97) {
			return true;
		}
		return false;
	}
	
	public boolean isNumber( )
	{
		test = theChar;
		if (test <= 57 && test >= 48) {
			return true;
		}
		return false;
	}	

	public int getASCII( )
	{
		return test;
	}

	public String toString()
	{

		if (isNumber() == true) {
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	  
		}
		
		else if (isLower() == true) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		else if (isUpper() == true) {
			return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";	  
			
		}
		return null;


	}
}