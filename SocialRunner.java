//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class SocialRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("social.dat"));
		int count = file.nextInt();
		file.nextLine();
		for (int i = 0; i < count; i++) {
			String line = file.nextLine();
			SocialDobranowski output = new SocialDobranowski(line);
			System.out.println(output);
		}

	}
}