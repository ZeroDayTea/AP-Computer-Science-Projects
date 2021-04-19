//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

public class Word
{
	private String word;

	public Word(String s)
	{
	   word = s;
   }

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length() - 1);
	}

	public String getBackWards()
	{
		String back="";
      for(int i = word.length() - 1; i >=0; i--)
      {
         char character = word.charAt(i);
         back += character;
      }
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
}