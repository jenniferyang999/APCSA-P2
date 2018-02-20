//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence, cleaned;
   private char lookFor;
   private int check;

	public LetterRemover()
	{
		setRemover(sentence, lookFor);
	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		while (sentence.indexOf(lookFor) != -1) {
			check = sentence.indexOf(lookFor);
			cleaned = sentence.substring(0, check) + sentence.substring(check + 1, sentence.length());
			sentence = cleaned;
		}
		return cleaned + "\n";
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + '\n' + removeLetters();
	}
}