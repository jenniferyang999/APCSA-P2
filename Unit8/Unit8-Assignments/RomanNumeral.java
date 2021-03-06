//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number, sum = 0, number1;
	private String roman, outputnum, outputstr = "";
	private char thing;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
			50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
		  "L","XL","X","IX","V","IV","I"};
	
	private final static int[] NUMBERS1= {900,1000,400,500,90,100,
													40,50,9,10,4,5,1};
	private final static String[] LETTERS1 = {"CM","M","CD","D","XC","C",
												  "XL","L","IX","X","IV","V","I"};
	
	

	public RomanNumeral(String str)
	{
		
		roman = str;		
		this.setRoman(str);
		
		
		/*for (int i = 0; i <= roman.length(); i++)
		{
			thing = roman.charAt(i);
			String test = String.valueOf(thing); //test is the letter at i
			//for (String item : LETTERS) {
				//if (test.equals(item)) {  if the letter == something in LETTERS
			
		for (int j=0; j < LETTERS.length; j++) {
			    if (test.equals(LETTERS[j])) {
					outputnum = outputnum + NUMBERS[j];
					out.println(outputnum);
				}
			}
		}
		*/
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		this.setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		outputstr = "";
		number = num;
		for (int k = 0; k < NUMBERS.length; k++) 
		{
			int thi = NUMBERS[k];
			while (number >= NUMBERS[k]) 
			{
				outputstr = outputstr + LETTERS[k];
				number = number - NUMBERS[k];
			}

		}
		
	 } 			

	public void setRoman(String rom)
	{
		sum = 0;
		roman = rom;
		for (int i = 0; i < LETTERS1.length; i++)
		{
			String letter1 = LETTERS1[i]; //string @ each index of LETTERS
			int test = roman.indexOf(letter1); //index of letter1
			if (test != -1) //if roman contains this string
			{
				if (letter1.equals("CM") || letter1.equals("CD") || letter1.equals("XC") || letter1.equals("XL") || letter1.equals("IX") || letter1.equals("IV"))
					{
						roman = roman.substring(0, test) + roman.substring(test + 2);
					}
				else
				{
					roman = roman.substring(0, test) + roman.substring(test + 1);

				}
				number1 = NUMBERS1[i];
				sum += number1; 
				i = 0;
			}
		}
	}

	public Integer getNumber()
	{
		return sum;
	}

	public String toString()
	{
		return outputstr + "\n";
	}
}