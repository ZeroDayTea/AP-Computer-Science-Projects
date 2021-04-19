//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a word:");
      String word = input.nextLine();
      
      Word go = new Word(word);
      char first = go.getFirstChar();
      char last = go.getLastChar();
      String backwards = go.getBackWards();
      
      System.out.println("" + first);
      System.out.println("" + last);
      System.out.println(backwards);
      System.out.println(go);
	}
}